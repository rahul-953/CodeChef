#include<stdio.h>
#include<string.h>

int main()
{
	int t;
	scanf("%d",&t);
	char a[1005];

	while(t--)
	{
		scanf("%s",a);
		int l,i=strlen(a);
		int j=i/2,key=0;
		int aa[26],bb[26];		
		l=i;
		a[l]='\0';
		for(j=0;j<26;j++)
		{
			aa[j]=0;
			bb[j]=0;
		}
//		
//			printf("%s\n",a);
		//i=l/2;
		//if(l%2==1)
		//i=(l/2)-1;
//		printf("%d",(a[0]));		

		for(j=0;j<l/2;j++)
		{
			//printf("Checking %c   ",a[j]);
			aa[-97+a[j]]++;
			//printf("aa[%d]= %d",(-97+a[j]),aa[-97+a[j]]);	
		}

		if(l%2==1)
		i=(l/2)+1;	
	
		else
		i=l/2;

		for(j=i;j<l;j++)
		{
			//printf("Checking %c   ",a[j]);
			bb[-97+a[j]]++;
	//		printf("bb[%d]= %d",(-97+a[j]),bb[-97+a[j]]);	
		}
		
		for(i=0;i<26;i++)
		{	
	//		printf("Comparing aa[%d] = %d    bb[%d] = %d\n",i,aa[i],i,bb[i]);
			if(aa[i]!=bb[i])
			{
				key=1;
				break;
			}
		}	
		if(key==1)
		printf("NO\n");
		else
		printf("YES\n");
	}
	return 0;
}