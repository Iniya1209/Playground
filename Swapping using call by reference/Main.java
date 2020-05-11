#include<iostream>
using namespace std;
int a,b;
int swap(int &x,int &y){
  x=x-y;
  y=x+y;
  x=y-a;
}
int main(){
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}