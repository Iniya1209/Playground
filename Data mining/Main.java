#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=0,b=0,n;
  cin>>n;
  while(n){
    if((n%10)%2==0)
       a+=n%10;
    else
       b+=n%10;
    n=n/10;
  }
  if(a==b)
    cout<<"Yes";
  else
    cout<<"No";
}