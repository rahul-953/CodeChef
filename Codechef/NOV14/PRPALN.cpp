for i in range(input()):
	a = raw_input()
	t=0
	for i in xrange(len(a)):
		ch = a[:i] + a[i+1:]
		if ch == ch[::-1]:
			t = 1
			print 'YES'
			break
	if t == 0:
		print 'NO'
