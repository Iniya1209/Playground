#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,t,a,temp,u,c=0,j=1;
  cin>>n;
  t=n*n;
  temp=n;
  u=n;
  while(u){
    c++;
    u=u/10;
  }
  for(int i=0;i<c;i++){
    j*=10;
  }
  int k=t%j;
  t=t/j;
  if(temp*temp<=9)
    cout<<"Not a Kaprekar Number";
  else if(t+k==temp)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}