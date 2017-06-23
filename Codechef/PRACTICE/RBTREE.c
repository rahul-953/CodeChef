/*
Chef's tree has the following special properties :
Each node of the tree is either colored red or black.
Root of the tree is black intially.
Both childs of a red colored node are black and both childs of a black colored node are red.

The root of the tree is labelled as 1. For a node labelled v, it's left child is labelled as 2*v and it's right child is labelled as 2*v+1.

Chef wants to fulfill Q queries on this tree. Each query belongs to any of the following three types:

Qi Change color of all red colored nodes to black and all black colored nodes to red.
Qb x y Count the number of black colored nodes on the path from node x to node y (both inclusive).
Qr x y Count the number of red colored nodes on the path from node x to node y (both inclusive).

Input

First line of the input contains an integer Q denoting the number of queries. Next Q lines of the input contain Q queries (one per line). Each query belongs to one of the three types mentioned above.

Output :For each query of type Qb or Qr, print the required answer.

Constraints
1<=Q<=105
1<=x,y<=109

Sample Input

5
Qb 4 5
Qr 4 5
Qi
Qb 4 5
Qr 4 5

Sample Output

2
1
1
2

Subtask #1: 1<=Q<=100 1<=x,y<=1000   : 27 pts
Subtask #2: 1<=Q<=103 1<=x,y<=105     :  25 pts
Subtask #3: 1<=Q<=105 1<=x,y<=109     :  48 pts

*/

#include<stdio.h>
#include<math.h>
#include<string.h>

int main()
{
	long long int q,count=1;
	scanf("%lld",&q);
	char qi[5];
	long long int x,y,lca;


	while(q--)
	{
	     scanf("%s",qi);
	      
	     if(strcmp(qi,"Qi")==0)	
	     count+=1;
 	      
	     else
	     {		
		scanf("%lld %lld",&x,&y);
		
		long long int lx,ly,level_lca,i=0,j=0,k=0,idxCount=0;
		long long int max,min,nodesX=0,nodesY=0,redX=0,blackX=0,redY=0,blackY=0;
		
		i=lx=(long long int)log2(x)+1;
		j=ly=(long long int)log2(y)+1;
		
		max=(lx>ly)?lx:ly;
		min=(lx<ly)?lx:ly;

		int binX[lx],binY[ly],LCA[max];
		i--;j--;

		while(x>0)
		{
			binX[i]=x%2;
			x/=2;
			i--;	
		}

		while(y>0)
		{
			binY[j]=y%2;
			y/=2;
			j--;	
		}
				
		for(k=0;k<min;k++)		
		{
			if(binX[k]==binY[k])
			{
				LCA[k]=binX[k];
				idxCount++;
			}

			else
			break;
		}

		long long int temp=0;
		lca=0;
		for(i=k-1;i>=0;i--,temp++)
		lca=lca+((long long int)pow(2,temp))*LCA[i];				

		nodesX = lx-idxCount+1;
		nodesY = ly-idxCount;
		
		level_lca=(long long int)log2(lca)+1;						

 // printf("\n\nnodesX : %lld\nnodesY : %lld\nLCA is: %lld\nCount is: %d\nAnswer is : ",nodesX,nodesY,lca,count);				
		
		if(count%2==1)	// => Odd level is black && Even Level is Red	
		{		
			if((level_lca)%2==1 )	
			{		
				redX=nodesX/2;					
				blackX=nodesX-redX;
			}

			else if((level_lca)%2==0 )	
			{					
				blackX=(nodesX/2);
				redX=nodesX-blackX;
			}
			
			/*	
			*/
	
			if((level_lca)%2==1 )	
			{		
				blackY=nodesY/2;					
				redY=nodesY-blackY;
			}

			else if((level_lca)%2==0 )	
			{					
				redY=(nodesY/2);
				blackY=nodesY-redY;
			}


			blackX+=blackY;
			redX+=redY;	
  		}

		else
		{
	
			if((level_lca)%2==1 )	
			{		
				blackX=nodesX/2;					
				redX=nodesX-blackX;
			}

			else if((level_lca)%2==0 )	
			{					
				redX=(nodesX/2);
				blackX=nodesX-redX;
			}
	
			if((level_lca)%2==1 )	
			{		
				redY=nodesY/2;					
				blackY=nodesY-redY;
			}

			else if((level_lca)%2==0 )	
			{					
				blackY=(nodesY/2);
				redY=nodesY-blackY;
			}


			blackX+=blackY;
			redX+=redY;

		}

		if(qi[1]=='b')		
		printf("%lld\n",blackX);

		else
		printf("%lld\n",redX);	
	     }										
	}

  return 0;
}
