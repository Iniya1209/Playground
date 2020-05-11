#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=0,b=2,n,c=0,t=6;
  cin>>n;
  if(n==1)
    cout<<a;
  if(n==2)
    cout<<a<<" "<<b;
  if(n>2){
    cout<<a<<" ";
  for(int i=1;i<n;i++){
    cout<<b<<" ";
    b+=t;
    c++;
    if(c%2==0)
      t=t+4;
  }
  }
}