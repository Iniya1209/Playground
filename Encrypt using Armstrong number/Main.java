#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int s=0,t,m,h,c=0;
  t=n;h=n;
  while(n){
    n=n/10;
    c++;
  }
  while(t){
    m=power(t%10,c);
    s+=m;
    t=t/10;
  }
  if(s==h)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}