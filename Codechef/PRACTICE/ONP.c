
#include<stdio.h>
#include<stdlib.h>
#include<string.h>


typedef struct stack
{	
	int top;
	char a[400];
} stack;

void push(stack *,char);
char pop(stack *);
 int isempty(stack *);
 int isfull(stack *);
int  priority(char );

int main()
{
	stack *s;

	int t;
	scanf("%d",&t);

	
	char infix[400],post[400],ch,hc;
	int i,j=0;
	
	while(t--)
	{
		

		s=(stack *)malloc(sizeof(stack));
		s->top = -1;
		scanf("%s",infix);
		for(i=0,j=0;infix[i]!='\0';i++)
		{
			ch=infix[i];
			if ( (ch>='a' && ch<='z')  || (ch>='A' && ch<='Z') )
			{	post[j]=ch;
				j++;
			}
			else if ( ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^' || ch=='(' || ch==')')
			{	if (ch=='(')
				push(s,ch);
				else if (ch==')')
				{ 	hc=pop(s);	
					while(hc!='(')
					{	post[j]=hc;
						hc=pop(s);
						j++;
					}
				}
				else if ( priority(ch) > priority(s->a[s->top]) )				
				push(s,ch);
				else
				{	while(priority(ch)<=priority(s->a[s->top]))
					{	hc=pop(s);
						if(hc!='(')
						{	post[j]=hc;
							j++;		
						}
					}
				    push(s,ch);
				}
			}

			
		}
		
		while((s->top)!=-1)
		{	post[j]=pop(s);
			j++;
		}
			
		post[j]='\0';
		printf("%s\n",post);
		free(s);
	
   	}

	return 0;

}


void push(stack *s,char item)
{	
	int i;
	if ( (i=isfull(s) ) )
	{
		s->top ++;	
		s->a[s->top]=item;
	}

	else
	return ;
}

char pop(stack *s )
{
	char val;
	int i;
	if ( !(i=isempty(s)) )
	{
		val=s->a[s->top];
		(s->top) --;
		return val;
	}

	else
	exit(1);
}


int isempty(stack *s)
{
	if ( (s->top) == (-1))
	return 1;
	
	
	else
	return 0; 
}

int isfull(stack *s)
{
	if ( s->top >= 399)
	return 0;

	else
	return 1;
}

int priority(char op)
{
	switch(op)
	{
		case '+'  :
		case  '-' :
		return(1);
		break;

		case '*' :
		case '/' :
		return(2);
		break;

		case '^' :
		return(3);
		break;

		case '(' :
		return(0);
		break;

		default:
		return(-1);					
	}					
}