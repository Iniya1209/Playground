#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,s=0,c=0;
  cin>>a;
  while(1){
    cin>>b;
    s+=b;
    c+=1;
    if(s>=a)
      break;
  }
  cout<<"The number of turns is "<<c;
}