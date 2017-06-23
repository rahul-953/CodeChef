#include<stdio.h>

inline int scan()
{
	int n=0,c=getchar_unlocked();
	while(c<'0'||c>'9')
	c=getchar_unlocked();
	while(c<='9'&&c>='0')
	n=(n<<1)+(n<<3)+c-'0',c=getchar_unlocked();
	return n;
}

int main()
{
	int t;
	t=scan();
	char a[1006];
	
	while(t--)
	{
		scanf("%s",a);	
		int n,i;
		scanf("%d",&n);
		int b[n];
		
		for(i=0;i<n;i++)
		scanf("%d",&b[i]);
		
		printf("%s\n",a);
	}
	
return 0;
}