#include <stdio.h>
#define putchar_unlocked putchar
#define getchar_unlocked getchar

inline void write(long a)
{
	char snum[35];
	int i=0;
	do
	{
		snum[i++]=a%10+48;
		a=a/10;
	}while(a!=0);
	--i;
	while(i>=0)
	putchar_unlocked(snum[i--]);
	putchar_unlocked('\n');
}
inline long read()
{
	long t=0;
	char c=getchar_unlocked();
	while(c>'9' || c<'0')
	c=getchar_unlocked();
	while(c<='9' && c>='0')
	{
		t=(t<<1)+(t<<3)+c-'0';
		c=getchar_unlocked();
	}
	return t;
}


int main()
{
    int t,n;
    t = read();
    while(t--){
        n = read();
        if(360%n==0) printf("y ");
        else printf("n ");
        if(n<=360) printf("y ");
        else printf("n ");
        if(n*(n+1)/2 <= 360) printf("y\n");
        else printf("n\n");
    }
	return 0;
}
