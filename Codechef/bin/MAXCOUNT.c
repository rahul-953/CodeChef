#include <stdio.h>
inline int fastread()
{
    int i=0;
    char c=0;
    while (c<33)
        c=getchar_unlocked();
    while (c>33)
    {
		i = i*10+c-'0';
		c=getchar_unlocked();
    }
    return i;
}
int main()
{
	int t,n,a,max,pos,i;
	t=fastread();
	for(;t;t--)
	{
		max=0;
		int b[10001]={0};
		n=fastread();
		for(i=0;i<n;i++)
		{
			a=fastread();
			b[a]++;
			if(b[a]>max)
			max=b[a],pos=a;
			if(b[a]==max&&a<pos)
			pos=a;
		}
		printf("%d %d\n",pos,max);
	}
	return 0;
}