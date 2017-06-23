     #include<stdio.h>
    #include<string.h>
    #include<math.h>
    #include<stdlib.h>
    #define max 1010
    unsigned long long int temp[500]={0};
    char s[max];
    char ss[max];
    int fine(int n)
    {
    int key=0;
    int k=0,q=0,r=0,i=0;
    strcpy(ss,s);
    do
    {
    k=q=r=i=0;
    q=((ss[0]-48)*10+(s[1]-48))*10+(s[2]-48);
    r=q;
    if(q>n-1)
    {
    r=q%n;
    q=q/n;
    ss[k]=q+48;
    k++;
    }
    for(i=3;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%n;
    q=q/n;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%n==0){
    key++;
    strcpy(s,ss);}
    } while(r%n==0);
    return key;
    }
    int fin(int n)
    {
    int key=0;
    int k=0,q=0,r=0,i=0;
    strcpy(ss,s);
    do
    {
    k=q=r=i=0;
    q=((ss[0]-48)*10+(s[1]-48));
    r=q;
    if(q>n-1)
    {
    r=q%n;
    q=q/n;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%n;
    q=q/n;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%n==0){
    key++;
    strcpy(s,ss);}
    } while(r%n==0);
    return key;
    }
    void primeFactors(unsigned long long int n)
    {
    int k=0;
    while (n%2 == 0)
    {
    temp[k]=2;
    k++;
    n = n/2;
    }
    unsigned long long int i;
    for ( i = 3; i <= sqrt(n); i = i+2)
    {
    while (n%i == 0)
    {
    temp[k]=i;
    k++;
    n = n/i;
    }
    }
    if (n > 2)
    {	
    temp[k]=n;
    k++;
    }	
    printf("%d\n",k);
    for(i=0;i<k;i++)	
    printf("%llu\n",temp[i]);
    }
    int main()
    {
    int t,j;
    scanf("%d",&t);
    int len,co=0,k=0,c2=0,c5=0,c3=0,count3=0,count_11_E,count_11_O,c11=0,c7=0,i=0,r,q,c13=0;
    while(t--)
    {
    scanf("%s",s);
    len=strlen(s);
    i=0;q=0;r=0;k=0;j=0;
    co=0;k=0;c2=0;c3=count3=0;c7=0;c5=0;c13=0;
    count_11_E=count_11_O=0;
    for(i=0;s[i]!='\0';i++)
    {
    count3+=s[i]-48;
    if(i%2==0)
    count_11_E+=s[i]-48;
    else
    count_11_O+=(s[i]-48);
    }	
    if(len>=17)
    {
    co=c5=0;c3=c11=c7=0;
    //-------------------------------------// Checking for 2 and its powers ---------------------------------
    for(j=0;s[j]!='\0'&&(s[len-1]-48)%2==0;)
    {
    k=0;
    q=s[0]-48;
    r=q;
    if(q>1)
    {
    r=q%2;
    q=q/2;
    s[k]=q+48;
    k++;
    }
    for(i=1;s[i]!='\0';i++)
    {
    q=r*10+(s[i]-48);
    r=q%2;
    q=q/2;
    s[k]=q+48;
    k++;
    }
    s[k]='\0';
    co++;
    len=strlen(s);
    }
    // ----------------------------- For 3 and its powers---------------------------------------------
    for(j=0;s[j]!='\0'&&(count3)%3==0;) // Checking for 3 and its powers
    {
    k=0;count3=0;
    q=s[0]-48;
    r=q;
    if(q>2)
    {
    r=q%3;
    q=q/3;
    count3+=q;
    s[k]=q+48;
    k++;
    }
    for(i=1;s[i]!='\0';i++)
    {
    q=r*10+(s[i]-48);
    r=q%3;
    q=q/3;
    count3+=q;
    s[k]=q+48;
    k++;
    }
    s[k]='\0';
    c3++;
    len=strlen(s);
    }
    // ----------------------------- For 5 and its powers---------------------------------------------
    for(j=0;s[j]!='\0'&&(s[len-1]-48)%5==0;)
    {
    k=0;
    q=s[0]-48;
    r=q;
    if(q>4)
    {
    r=q%5;
    q=q/5;
    s[k]=q+48;
    k++;
    }
    for(i=1;s[i]!='\0';i++)
    {
    q=r*10+(s[i]-48);
    r=q%5;
    q=q/5;
    s[k]=q+48;
    k++;
    }
    s[k]='\0';
    c5++;
    len=strlen(s);
    }
    //-------------------------------------// Checking for 7 and its powers ---------------------------------
    // int sum=0;
    c7=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48);
    r=q;
    if(q>=7)
    {
    r=q%7;
    q=q/7;
    ss[k]=q+48;
    k++;
    }
    for(i=1;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%7;
    q=q/7;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%7==0){
    c7++;strcpy(s,ss);}
    } while(r%7==0);
    //printf("\nSS After fineiding: %s\n",ss);
    //printf("\nS After fineiding: %s\n",s);
    // ----------------------------- For 11 and its powers---------------------------------------------
    count_11_E=0;count_11_O=0;
    for(i=0;s[i]!='\0';i++)
    {
    if(i%2==0)
    count_11_E+=(s[i]-48);
    else
    count_11_O+=(s[i]-48);
    }
    int d=abs(count_11_E-count_11_O);
    for(j=0;s[j]!='\0'&& ( d==0 || d%11==0) ; )
    {
    k=0;count_11_E=count_11_O=0;
    q=(s[0]-48)*10+(s[1]-48);
    r=q;
    if(q>10)
    {
    r=q%11;
    q=q/11;
    s[k]=q+48;
    if(k%2==0)
    count_11_E+=q;
    else
    count_11_O+=q;
    k++;
    }
    for(i=2;s[i]!='\0';i++)
    {
    q=r*10+(s[i]-48);
    r=q%11;
    q=q/11;
    s[k]=q+48;
    if(k%2==0)
    count_11_E+=q;
    else
    count_11_O+=q;
    k++;
    }
    s[k]='\0';
    c11++;
    len=strlen(s);
    d=abs(count_11_E-count_11_O);
    }
    // ----------------------------- For 17 and its powers---------------------------------------------
    c13=fin(13);
    int c17=fin(17);
    //------------------------------------ for 19-----------------------------------
    int c19=fin(19);
    //------------------------------------ for 23-----------------------------------
    int c23=fin(23);
    //------------------------------------ for 29-----------------------------------
    int c29=fin(29);
    //------------------------------------ for 31-----------------------------------
    int c31=fin(31);
    //------------------------------------ for 37-----------------------------------
    int c37=fin(37);
    int c41=fin(41);
    int c43=fin(43);
    //------------------------------------ for 47-----------------------------------
    int c47=fin(47);
    int c53=fin(53);
    //------------------------------------ for 59-----------------------------------
    int c59=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>58)
    {
    r=q%59;
    q=q/59;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%59;
    q=q/59;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%59==0){
    c59++;
    strcpy(s,ss);}
    } while(r%59==0);
    //------------------------------------ for 61-----------------------------------
    int c61=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>60)
    {
    r=q%61;
    q=q/61;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%61;
    q=q/61;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%61==0){
    c61++;
    strcpy(s,ss);}
    } while(r%61==0);
    //------------------------------------ for 67-----------------------------------
    int c67=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>66)
    {
    r=q%67;
    q=q/67;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%67;
    q=q/67;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%67==0){
    c67++;
    strcpy(s,ss);}
    } while(r%67==0);
    //------------------------------------ for 71-----------------------------------
    int c71=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>70)
    {
    r=q%71;
    q=q/71;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%71;
    q=q/71;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%71==0){
    c71++;
    strcpy(s,ss);}
    } while(r%71==0);
    //------------------------------------ for 73-----------------------------------
    int c73=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>72)
    {
    r=q%73;
    q=q/73;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%73;
    q=q/73;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%73==0){
    c73++;
    strcpy(s,ss);}
    } while(r%73==0);
    //------------------------------------ for 79-----------------------------------
    int c79=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>78)
    {
    r=q%79;
    q=q/79;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%79;
    q=q/79;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%79==0){
    c79++;
    strcpy(s,ss);}
    } while(r%79==0);
    //------------------------------------ for 83-----------------------------------
    int c83=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>82)
    {
    r=q%83;
    q=q/83;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%83;
    q=q/83;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%83==0){
    c83++;
    strcpy(s,ss);}
    } while(r%83==0);
    //------------------------------------ for 89-----------------------------------
    int c89=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>88)
    {
    r=q%89;
    q=q/89;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%89;
    q=q/89;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%89==0){
    c89++;
    strcpy(s,ss);}
    } while(r%89==0);
    //------------------------------------ for 97-----------------------------------
    int c97=0;
    strcpy(ss,s);
    do
    {
    //printf("\nSS After copy: %s\n",ss);
    k=0;q=0;r=0;
    q=(ss[0]-48)*10+(s[1]-48);
    r=q;
    if(q>96)
    {
    r=q%97;
    q=q/97;
    ss[k]=q+48;
    k++;
    }
    for(i=2;ss[i]!='\0';i++)
    {
    q=r*10+(ss[i]-48);
    r=q%97;
    q=q/97;
    ss[k]=q+48;
    k++;
    }
    ss[k]='\0';
    if(r%97==0){
    c97++;
    strcpy(s,ss);}
    } while(r%97==0);
    //------------------------------------ for 101-----------------------------------
    int c101=fine(101);
    int c103=fine(103);
    int c107=fine(107);
    int c109=fine(109);
    int c113=fine(113);
    int c127=fine(127);
    int c131=fine(131);
    int c139=fine(139);
    int c137=fine(137);
    int c149=fine(149);
    int c151=fine(151);
    int c157=fine(157);
    int c163=fine(163);
    int c167=fine(167);
    int c173=fine(173);
    int c179=fine(179);
    int c181=fine(181);
    int c191=fine(191);
    int c193=fine(193);
    int c197=fine(197);
    int c199=fine(199);
    int c211=fine(211);
    int c223=fine(223);
    int c227=fine(227);
    int c229=fine(229);
    int c233=fine(233);
    int c239=fine(239);
    int c241=fine(241);
    int c251=fine(251);
    int c257=fine(257);
    int c263=fine(263);
    int c269=fine(269);
    int c271=fine(271);
    int c277=fine(277);
    int c281=fine(281);
    int c283=fine(283);
    int c293=fine(293);
    int c307=fine(307);
    int c311=fine(311);
    int c313=fine(313);
    int and=co==0 && c5==0 && c11==0 && c3==0&& c7==0&& c13==0&& c17==0 && c19==0 && c23==0&& c29==0&&c31==0 && c37==0 && c41==0 && c43==0 &&c47==0 && c53==0&& c59==0 && c61==0 && c67==0 && c71==0 && c73==0 && c79==0 && c83==0 && c89==0 && c97==0&&c101==0 && c109==0 && c113==0&&c127==0 && c131==0&&c137==0 && c139==0 && c107==0&&c103==0 &&c149==0 && c151==0 && c157==0&&c163==0 && c167==0&&c173==0 && c179==0 && c181==0&&c191==0 && c193==0&&c197==0 && c199==0&&c211==0 && c223==0 && c227==0&&c229==0 && c233==0&&c239==0 && c241==0&&c251==0 && c257==0 && c263==0&&c269==0 && c271==0&&c277==0 && c281==0&&c283==0 && c293==0 && c307==0&&c311==0 &&c313==0;
    if(strcmp(s,"1")==0)
    {
    printf("%d\n",(co+c5+c3+c11+c7+c13+c17+c19+c23+c29+c31+c37+c41+c43+c47+c53+c59+c61+c67+c71+c73+c79+c83+c89+c97+c101 +c103+c107+c109 +c113+c127 +c131+c137+c139 +c149 +c151+c157+c163 +c167+c173 +c179+c181+c191 +c197+c193 +c199+c229 +c211+c223+c227 +c233+c239+c241 +c251+c257 +c263+c269+c271 +c277+c281 +c283+c293 +c307+c311+c313 ));
    for(i=1;i<=co;i++)	
    printf("2\n");
    for(i=1;i<=c3;i++)	
    printf("3\n");
    for(i=1;i<=c5;i++)
    printf("5\n");
    for(i=1;i<=c7;i++)	
    printf("7\n");
    for(i=1;i<=c11;i++)	
    printf("11\n");
    for(i=1;i<=c13;i++)	
    printf("13\n");
    for(i=1;i<=c17;i++)	
    printf("17\n");
    for(i=1;i<=c19;i++)	
    printf("19\n");
    for(i=1;i<=c23;i++)	
    printf("23\n");
    for(i=1;i<=c29;i++)	
    printf("29\n");
    for(i=1;i<=c31;i++)	
    printf("31\n");
    for(i=1;i<=c37;i++)	
    printf("37\n");
    for(i=1;i<=c41;i++)	
    printf("41\n");
    for(i=1;i<=c43;i++)	
    printf("43\n");
    for(i=1;i<=c47;i++)	
    printf("47\n");
    for(i=1;i<=c53;i++)	
    printf("53\n");
    for(i=1;i<=c59;i++)	
    printf("59\n");
    for(i=1;i<=c61;i++)	
    printf("61\n");
    for(i=1;i<=c67;i++)	
    printf("67\n");
    for(i=1;i<=c71;i++)	
    printf("71\n");
    for(i=1;i<=c73;i++)	
    printf("73\n");
    for(i=1;i<=c79;i++)	
    printf("79\n");
    for(i=1;i<=c83;i++)	
    printf("83\n");
    for(i=1;i<=c89;i++)	
    printf("89\n");
    for(i=1;i<=c97;i++)	
    printf("97\n");
    for(i=1;i<=c101;i++)	
    printf("101\n");
    for(i=1;i<=c103;i++)	
    printf("103\n");
    for(i=1;i<=c107;i++)	
    printf("107\n");
    for(i=1;i<=c109;i++)	
    printf("109\n");
    for(i=1;i<=c113;i++)	
    printf("113\n");
    for(i=1;i<=c127;i++)	
    printf("127\n");
    for(i=1;i<=c131;i++)	
    printf("131\n");
    for(i=1;i<=c137;i++)	
    printf("137\n");
    for(i=1;i<=c139;i++)	
    printf("139\n");
    for(i=1;i<=c149;i++)	
    printf("149\n");
    for(i=1;i<=c151;i++)	
    printf("151\n");
    for(i=1;i<=c157;i++)	
    printf("157\n");
    for(i=1;i<=c163;i++)	
    printf("163\n");
    for(i=1;i<=c167;i++)	
    printf("167\n");
    for(i=1;i<=c173;i++)	
    printf("173\n");
    for(i=1;i<=c179;i++)	
    printf("179\n");
    for(i=1;i<=c181;i++)	
    printf("181\n");
    for(i=1;i<=c191;i++)	
    printf("191\n");
    for(i=1;i<=c193;i++)	
    printf("193\n");
    for(i=1;i<=c197;i++)	
    printf("197\n");
    for(i=1;i<=c199;i++)	
    printf("199\n");
    for(i=1;i<=c211;i++)	
    printf("211\n");
    for(i=1;i<=c223;i++)	
    printf("223\n");
    for(i=1;i<=c227;i++)	
    printf("227\n");
    for(i=1;i<=c229;i++)	
    printf("229\n");
    for(i=1;i<=c233;i++)	
    printf("233\n");
    for(i=1;i<=c239;i++)	
    printf("239\n");
    for(i=1;i<=c241;i++)	
    printf("241\n");
    for(i=1;i<=c251;i++)	
    printf("251\n");
    for(i=1;i<=c257;i++)	
    printf("257\n");
    for(i=1;i<=c263;i++)	
    printf("263\n");
    for(i=1;i<=c269;i++)	
    printf("269\n");
    for(i=1;i<=c271;i++)	
    printf("271\n");
    for(i=1;i<=c277;i++)	
    printf("277\n");
    for(i=1;i<=c281;i++)	
    printf("281\n");
    for(i=1;i<=c283;i++)	
    printf("283\n");
    for(i=1;i<=c293;i++)	
    printf("293\n");
    for(i=1;i<=c307;i++)	
    printf("307\n");
    for(i=1;i<=c311;i++)	
    printf("311\n");
    for(i=1;i<=c313;i++)	
    printf("313\n");
    }
     
    else if(and)
    printf("1\n%s\n",s);
    else
    {
    printf("%d\n",co+1+c5+c3+c11+c7+c13+c17+c19+c23+c29+c31+c37+c41+c43+c47+c53+c59+c61+c67+c71+c73 +c79+c83+c89+c97+c101 +c103+c107+c109 +c113+c127 +c131+c137+c139 +c149 +c151+c157+c163 +c167+c173 +c179+c181+c191 +c193+c197 +c199+c211 +c223+c227+c229 +c233+c239+c241 +c251+c257 +c263+c269+c271 +c277+c281 +c283+c293 +c307+c311+c313 );
    for(i=1;i<=co;i++)	
    printf("2\n");
    for(i=1;i<=c3;i++)	
    printf("3\n");
    for(i=1;i<=c5;i++)
    printf("5\n");
    for(i=1;i<=c7;i++)	
    printf("7\n");
    for(i=1;i<=c11;i++)	
    printf("11\n");
    for(i=1;i<=c13;i++)	
    printf("13\n");
    for(i=1;i<=c17;i++)	
    printf("17\n");
    for(i=1;i<=c19;i++)	
    printf("19\n");
    for(i=1;i<=c23;i++)	
    printf("23\n");
    for(i=1;i<=c29;i++)	
    printf("29\n");
    for(i=1;i<=c31;i++)	
    printf("31\n");
    for(i=1;i<=c37;i++)	
    printf("37\n");
    for(i=1;i<=c41;i++)	
    printf("41\n");
    for(i=1;i<=c43;i++)	
    printf("43\n");
    for(i=1;i<=c47;i++)	
    printf("47\n");
    for(i=1;i<=c53;i++)	
    printf("53\n");
    for(i=1;i<=c59;i++)	
    printf("59\n");
    for(i=1;i<=c61;i++)	
    printf("61\n");
    for(i=1;i<=c67;i++)	
    printf("67\n");
    for(i=1;i<=c71;i++)	
    printf("71\n");
    for(i=1;i<=c73;i++)	
    printf("73\n");
    for(i=1;i<=c79;i++)	
    printf("79\n");
    for(i=1;i<=c83;i++)	
    printf("83\n");
    for(i=1;i<=c89;i++)	
    printf("89\n");
    for(i=1;i<=c97;i++)	
    printf("97\n");
    for(i=1;i<=c101;i++)	
    printf("101\n");
    for(i=1;i<=c103;i++)	
    printf("103\n");
    for(i=1;i<=c107;i++)	
    printf("107\n");
    for(i=1;i<=c109;i++)	
    printf("109\n");
    for(i=1;i<=c113;i++)	
    printf("113\n");
    for(i=1;i<=c127;i++)	
    printf("127\n");
    for(i=1;i<=c131;i++)	
    printf("131\n");
    for(i=1;i<=c137;i++)	
    printf("137\n");
    for(i=1;i<=c139;i++)	
    printf("139\n");
    for(i=1;i<=c149;i++)	
    printf("149\n");
    for(i=1;i<=c151;i++)	
    printf("151\n");
    for(i=1;i<=c157;i++)	
    printf("157\n");
    for(i=1;i<=c163;i++)	
    printf("163\n");
    for(i=1;i<=c167;i++)	
    printf("167\n");
    for(i=1;i<=c173;i++)	
    printf("173\n");
    for(i=1;i<=c179;i++)	
    printf("179\n");
    for(i=1;i<=c181;i++)	
    printf("181\n");
    for(i=1;i<=c191;i++)	
    printf("191\n");
    for(i=1;i<=c193;i++)	
    printf("193\n");
    for(i=1;i<=c197;i++)	
    printf("197\n");
    for(i=1;i<=c199;i++)	
    printf("199\n");
    for(i=1;i<=c211;i++)	
    printf("211\n");
    for(i=1;i<=c223;i++)	
    printf("223\n");
    for(i=1;i<=c227;i++)	
    printf("227\n");
    for(i=1;i<=c229;i++)	
    printf("229\n");
    for(i=1;i<=c233;i++)	
    printf("233\n");
    for(i=1;i<=c239;i++)	
    printf("239\n");
    for(i=1;i<=c241;i++)	
    printf("241\n");
    for(i=1;i<=c251;i++)	
    printf("251\n");
    for(i=1;i<=c257;i++)	
    printf("257\n");
    for(i=1;i<=c263;i++)	
    printf("263\n");
    for(i=1;i<=c269;i++)	
    printf("269\n");
    for(i=1;i<=c271;i++)	
    printf("271\n");
    for(i=1;i<=c277;i++)	
    printf("277\n");
    for(i=1;i<=c281;i++)	
    printf("281\n");
    for(i=1;i<=c283;i++)	
    printf("283\n");
    for(i=1;i<=c293;i++)	
    printf("293\n");
    for(i=1;i<=c307;i++)	
    printf("307\n");
    for(i=1;i<=c311;i++)	
    printf("311\n");
    for(i=1;i<=c313;i++)	
    printf("313\n");
    printf("%s\n",s);
    }
    }
    else if(len>=17 )	
    printf("1\n%s\n",s);
    else
    {
    unsigned long long int n=0;
    for(i=0;s[i]!='\0';i++)
    n=n*10+(s[i]-48);
    primeFactors(n);
    }
    }
    return 0;
    } 