#include<iostream>
using namespace std;
struct time{
  int h;
  int m;
  int s;
}a,b;
int main()
{
  //Type your code here.
  cin>>a.h>>a.m>>a.s>>b.h>>b.m>>b.s;
  int x=a.s-b.s;
  int y=a.m-b.m;
  int z=a.h-b.h;
  if(y<0){
    y+=60;
    z--;
  }
  if(x<0){
      x+=60;
      y--;
  }
  cout<<z<<":"<<y<<":"<<x;
}
