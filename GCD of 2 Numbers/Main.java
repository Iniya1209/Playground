#include<iostream>
int gcd(int,int);
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}
int gcd(int x,int y){
  if(y==0)
    return x;
  else
    return gcd(y,x%y);
}