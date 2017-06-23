#include<stdio.h>
int main()
{
	char a[100000];
	int  i,j,count,k;
	

	
	scanf("%s",a);

	for(i=0;a[i]!='\0';i++)
	{
		if( a[i]=='C')
		{
			a[i]='0';

			j=i+1;

			while( a[j] !='H' && a[j] != '\0')
			j++;

			if( a[j]!='H')	
			continue;

			else
			{
				a[j]='0';

				k=j+1;

				while( a[k] !='E' && a[k] != '\0')
				k++;

				if( a[k]!='E')	
				continue;
				
				

				else
	    		      {
				a[k]='0';	
				k=k+1;
				while( a[k] !='F' && a[k] != '\0')
				k++;

				if( a[k]!='F')	
				continue;

				else { count++; a[k]='0';}	

			      }		


			}	
	
		}
	}	

	printf("%d\n",count);
	return 0;	
}



