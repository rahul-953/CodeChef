import os
rootdir = 'D:\\Codechef\\'

for subdir, dirs, files in os.walk(rootdir):
    for file in files:
		filename,file_extension=os.path.splitext(file)
		
		if file_extension==".java":
			filepath =  os.path.join(subdir, file)
			
			lines = []
			with open(filepath) as infile:
			    for line in infile:
					lines.append(line)
			is_ImportsStarted = False
			oldLine = ""
			newLine = ""
			for eachLine in lines:
				if eachLine.find('import ')>=0:
					is_ImportsStarted = True
					#print eachLine
					#inr = raw_input('Enter to continue')
				elif is_ImportsStarted :
					# All imports are finished and assuming that after that first non empty line with "class" in it is the "main class"
					if eachLine.find('class ')>=0:
						oldLine = eachLine
						list_of_words = eachLine.split()
						oldClass = list_of_words[list_of_words.index('class') + 1]
						newLine = eachLine.replace(oldClass,filename)
						#print eachLine
						break
			lines = [l.replace(oldLine,newLine) for l in lines]
			#inr = raw_input('Enter to continue')
			with open(filepath,'w') as outfile:
				for line in lines:
					outfile.write(line)	