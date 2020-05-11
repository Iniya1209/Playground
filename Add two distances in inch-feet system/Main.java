#include<iostream>
using namespace std;
struct dist{
   int f;
   float i;
}a,b;
int main()
{
  //Type your code here.
  cin>>a.f>>a.i>>b.f>>b.i;
  int x=a.f+b.f;
  float y=a.i+b.i;
  if(y>12.0){
     y=y-12.0;
     x++;
  }
  cout<<x<<"\'-"<<y<<"\"";
}