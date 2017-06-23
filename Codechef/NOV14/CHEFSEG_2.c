    #include<stdio.h>
    #include<math.h>
     
    int main()
    {
	    int t;
	    double x,k,end;
	    scanf("%d",&t);
	    double ans=0;

	    while(t--)
	    {
		    scanf("%lf %lf",&x,&k);
		    double level=((floor)(log(k)/log(2)))+1;
		    
		   //printf("\nLevel is: %lf\n ",level);
		   double begin=x/(int)pow(2,level);
		   //printf("\nBegin is: %lf\n ",begin);
		   end=k+1-pow(2,level-1);
		   //printf("\nend is: %lf\n ",end);

		   double temp=(double)((double)((end-1))*(double)((double)x/(double)pow(2,level-1)));
		   //printf("\ntemp is: %lf\n ",temp);
		   ans=(double)begin+(double)temp;
		   printf("%lf\n",ans);
	    }

	    return 0;
    } 