#include<stdio.h>
#include<math.h>

int main()
{
	int n,x1,y1,x2,y2,x3,y3;
	int a,b,c;
	int count=0;
	scanf("%d",&n);
	
	while(n--)
	{
		scanf("%d%d%d %d%d%d",&x1,&y1,&x2, &y2,&x3,&y3);
		a=((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) );
		b=((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2) );
		c=((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3) );
		
		if((a==b+c) ||(b==a+c ) || (c==a+b) )
		count++;
	}
	printf("%ld\n",count);
return 0;
}
