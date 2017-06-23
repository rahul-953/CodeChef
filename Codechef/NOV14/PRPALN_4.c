#include<stdio.h>
#include<string.h>
     
int main()
{		
	char word[1000005],temp[1000005];
  	int t;
	long long int i,j;
	scanf("%d",&t);
	char a[1000005];
   
	 while(t--)
	 {
	    int count=0;
	    scanf("%s",a);

			
	    if(strlen(a)>=1000) 			
	    {
		for(i=0;i<=j;i++)
		{
			if(a[i]==a[j])
			j--;
 
			else if(a[i]==a[j-1])
			{
				j--;i--;count++;
			}
		
			else if(a[i]!=a[j-1])
			{
				//j-=2;
				//i--;
				count++;
			}

			if(count>=2)
			break;
		}

		if(count>=2)
		printf("NO\n");
		else
		printf("YES\n");
		
	  }


	else
	{
	  int idxToDel; 	

	    for(i=0;a[i]!='\0';i++)
	    {
		strcpy(word,a);
		idxToDel=i;			
		memmove(&word[idxToDel], &word[idxToDel + 1], strlen(word) - idxToDel);

		strcpy(temp,word);
	
		j=strlen(word)-1;
		int k;
		for(k=0;k<=strlen(word)-1;k++,j--)
		temp[k]=word[j];

		temp[k]='\0';
		//printf("String is: %s\nReverse is: %s\n",word,temp);

		if(strcmp(temp,word)==0)
		{
			printf("YES\n");
			count++;			
			break;
		}
	    }

	    if(count==0)
	    printf("NO\n");
//	    else
//	    printf("YES\n");
	}
   }	
    return 0;
    } 