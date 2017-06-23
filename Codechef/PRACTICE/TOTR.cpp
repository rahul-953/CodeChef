#include<stdio.h>
//#include<conio.h>
#include<iostream>
#include<string.h>

using namespace std;
      
inline int num(char b)
{
       if(b=='a' )       
       return 1;
      
       else if(b=='_')
       return 27;
       
       else if(b=='b' )       
       return 2;

       else if(b=='c')       
       return 3;

       else if(b=='d')       
       return 4;

       else if(b=='e' )       
       return 5;

       else if(b=='f' )       
       return 6;
       
       else if(b=='g' )       
       return 7;
       
       else if(b=='h' )       
       return 8;
       
       else if(b=='i' )       
       return 9;
       
       else if(b=='j' )       
       return 10;

       else if(b=='k' )       
       return 11;

       else if(b=='l' )       
       return 12;

       else if(b=='m' )       
       return 13;

       else if(b=='n' )       
       return 14;

       else if(b=='o' )       
       return 15;

       else if(b=='p')       
       return 16;

       else if(b=='q')       
       return 17;

       else if(b=='r' )       
       return 18;

       else if(b=='s' )       
       return 19;

       else if(b=='t' )       
       return 20;

       else if(b=='u')       
       return 21;

       else if(b=='v' )       
       return 22;

      else if(b=='w' )       
       return 23;

       else if(b=='x' )       
       return 24;

       else if(b=='y' )       
       return 25;
       
       else if(b=='z' )       
       return 26;
       
       
       
       
       
       
       
       
       
       if(b=='A' )       
       return 31;
       
       else if(b=='B' )       
       return 32;

       else if(b=='C')       
       return 33;

       else if(b=='D')       
       return 34;

       else if(b=='E' )       
       return 35;

       else if(b=='F' )       
       return 36;
       
       else if(b=='G' )       
       return 37;
       
       else if(b=='H' )       
       return 38;
       
       else if(b=='I' )       
       return 39;
       
       else if(b=='J' )       
       return 40;

       else if(b=='K' )       
       return 41;

       else if(b=='L' )       
       return 42;

       else if(b=='M' )       
       return 43;

       else if(b=='N' )       
       return 44;

       else if(b=='O' )       
       return 45;

       else if(b=='P')       
       return 46;

       else if(b=='Q')       
       return 47;

       else if(b=='R' )       
       return 48;

       else if(b=='S' )       
       return 49;

       else if(b=='T' )       
       return 50;

       else if(b=='U')       
       return 51;

       else if(b=='V' )       
       return 52;

      else if(b=='W' )       
       return 53;

       else if(b=='X' )       
       return 54;

       else if(b=='Y' )       
       return 55;
       
       else if(b=='Z' )       
       return 56;
       
       else 
       return 28;
}


int main()
{
    
    int t,i,len,temp;
    char m[26],s[101],o,out[101];
    cin>>t>>m;

    
   while(t--)
    {
       cin>>s;
       len=strlen(s);
       
       for(i=0;i<len;i++)
       {
          temp=num(s[i]);                                 
          
          if(temp==27)
          out[i]=' ';
          
          else if(temp<27)      
          out[i]=m[temp-1];
          
          else if(temp==28)
          out[i]=s[i];
          
          else
          out[i] = m[temp-31] -' ';
       }
       out[i]='\0';
       cout<<out<<endl;
       out[0]='\0';
    }
  
  
   // getch();
    return 0;
}


