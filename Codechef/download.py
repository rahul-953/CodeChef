#import the library used to query a website
import time
import urllib2
import requests
import traceback
import os
import sys
import errno
from bs4 import BeautifulSoup
from sys import platform

def writeInfFile(subdirectory, files, extension, content):
	
	if platform == "linux" or platform == "linux2":
		baseFolder = "/home/rahul/Documents/Codechef/"
		fileSeperator = "/"
	elif platform == "win32" :
		baseFolder = "D:\\Codechef\\"
		fileSeperator = "\\"
	challengeFolder = baseFolder+subdirectory
	filename = files+"."+extension
	filepath = challengeFolder+fileSeperator+filename
	
	try:
		#if CHALLENGE FOLDER does not exists create FILE 
		if not os.path.exists(challengeFolder):
			os.makedirs(challengeFolder)
			output = open(filepath, "a")
			output.write(content)
			
		#if CHALLENGE FOLDER exists:
		else:
			#But FILE is not created yet
			if not os.path.exists(filepath):
				output = open(filepath, "a")
				output.write(content)
			
			# FILE is already created
			else:
				version = 2
				
				# Add _num++ at the end of fielname till this name is already used
				while True:
					filename = files+"_"+str(version)+"."+extension
					filepath = challengeFolder+fileSeperator+filename
					if not os.path.exists(filepath):
						output = open(filepath, "a")
						output.write(content)
						break
					
					version +=1
					#print version
					

	except OSError as exc: # Guard against race condition
		if exc.errno != errno.EEXIST:
			print "RAISING"
			raise	
	except Exception as ex:
		template = "An exception of type {0} occurred. Arguments:\n{1!r}"
		message = template.format(type(ex).__name__, ex.args)
		print message+"\n\n==============="
		
		for frame in traceback.extract_tb(sys.exc_info()[2]):
			fname,lineno,fn,text = frame
			print "Error in %s on line %d" % (fname, lineno)
		return False
	return True

def getFilename(link):
	filename = link.get('href').split("/",1)[1]
	filename = filename.split("/",1)[1]
	filename = filename[:filename.index(',')]
	return filename

def getSubDIR(link):
	subdir = link.get('href').split("/",1)[1]
	subdir = subdir[:subdir.index('/')]
	return subdir

def getBeautifulSoup(uri):
	page = requests.get(uri)
	html_contents = page.text
	soup = BeautifulSoup(html_contents,"lxml")
	return soup

def find_All_a_Tags(url):
	soup = getBeautifulSoup(url)
	totalQuestions = soup.find_all('a')
	return totalQuestions

def saveSuccessfullSubmissionCode(questionURL,username):
	failed_urls = []
	no_of_questions=0
	totalSuccessfullSubmissions=0
	curr = 1
	try:
		for link in questionURL:
			no_of_questions+=1
			href_str = str(link.get('href'))
			if 	href_str.endswith(","+username):
				child = "https://www.codechef.com"+link.get('href')+"?sort_by=All&sorting_order=asc&language=All&status=15"

				subdir = getSubDIR(link)
				if(subdir=="status"):
					subdir = "PRACTICE"
					filename = getFilename(link)
				else:
					filename = getFilename(link)
					filename = filename.split("/",1)[1]

				print "SubDIR = "+subdir+"\t Filename : " +filename 
				soupchild = getBeautifulSoup(child)
				table = soupchild.find("table", {"class":"dataTable"})
				if table is None:
					print 'Will Fail in Table...................'
					failed_urls.append(link)
					continue
				for row in table.find_all("tr"):
					cells = row.find_all("td",{"class":"centered"})
					if len(cells)>0:
						if cells is None:
							print 'Will Fail in cells...................'
							failed_urls.append(link)
							continue

						view =  str(cells[4])
						if cells[3] is None:
							print 'Will Fail in cell[3]...................'
							failed_urls.append(link)
							continue
						language = (cells[3].contents)[0]
						if language=="JAVA":
							ext = "java"
						elif language=="C":
							ext="c"
						else:
							ext ="cpp"
						solution = cells[4].find_all('a')
						solution_href = str(solution[0].get('href'))
						solution_href ="https://www.codechef.com"+ solution_href.replace('viewsolution','viewplaintext')

						codeSoup = getBeautifulSoup(solution_href)

						if codeSoup is None:
							print "Will Fail in codeSoup"
							failed_urls.append(link)
							continue
						text = codeSoup.find("pre")

						if(text is None):
							print 'Will Fail in text...................'
							failed_urls.append(link)
							continue

						text  = str(text.contents[0].encode('utf-8'))
						#print text[0]
						if not writeInfFile(subdir,filename,ext,text):
							failed_urls.append(link)
							continue
						totalSuccessfullSubmissions+=1
						print 'Completed %d of %d'%(curr,len(questionURL))
						curr+=1
	except Exception as ex:
		template = "An exception of type {0} occurred. Arguments:\n{1!r}"
		message = template.format(type(ex).__name__, ex.args)
		print message+"\n\n==============="

		for frame in traceback.extract_tb(sys.exc_info()[2]):
			fname,lineno,fn,text = frame
			print "Error in %s on line %d" % (fname, lineno)
		print "\n================================\nTotal Submisssion = ",totalSuccessfullSubmissions,"\nTotal qustions answered = ",no_of_questions

	return failed_urls

start_time = time.time()
usernames = "rahul_953"
print "Phase-1:"
questionsAttemptedURL = getBeautifulSoup("https://www.codechef.com/users/"+usernames).find_all('a')
failed_urls = saveSuccessfullSubmissionCode(questionsAttemptedURL,usernames)


if len(failed_urls)>0:
	print "Phase-2:"
	failed_urls = saveSuccessfullSubmissionCode(failed_urls,usernames)
print("\n--- %s seconds ---" % (time.time() - start_time))