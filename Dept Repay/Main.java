#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int p,n,r;
  cin>>p>>r>>n;
  float i=(p*n*r)/100;
  float a=i+p;
  float d=i*2/100;
  float h=a-d;
  cout<<(p*n*r)/100<<"\n";
  cout<<(p*n*r)/100+p<<"\n";
  cout<<d<<"\n";
  cout<<h;
}