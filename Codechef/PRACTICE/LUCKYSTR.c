#include<stdio.h>
#include<string.h>
/*int substr(char *a,char *b)
{
    int r;
	for(int k=0; k<strlen(a); k++)
    {
        for(int l=0; l<strlen(b); l++)
        {
			if(a[k]==b[l])
            {
                r=strcmp(a+strlen(a),b+strlen(b));
                printf("%d",r);
				if(r==0)
					return 1;
            }
            else
            {
                return 0;
            }
   	    }
	}
}
*/
main()
{
	int i,j,n,k,p,f=0;
	char a[52][52],b[52][52];
	scanf("%d %d",&k,&n);
	for(i=0;i<k;i++)
		scanf("%s",&a[i]);
	for(i=0;i<n;i++)
		scanf("%s",&b[i]);
	for(i=0;i<n;i++){		
		p=strlen(b[i]);
		if(p>=47){
			printf("Good\n");
			f=1;
			continue;
		}
		for(j=0;j<k;j++){
			if(strstr(b[i],a[j])){
				printf("Good\n");
				f=1;
				break;
			}
			else
			    f=0;
		}
		if(f==0)
			printf("Bad\n");
	}
	return 0;
}
		
		
