#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float t;
  cin>>a>>t;
  if(t==13.30f){
    if(a<13)
      cout<<"$2.00";
    else
      cout<<"$5.00";
  }
  else{
    if(a<13)
      cout<<"$4.00";
    else
      cout<<"$8.00";
  }
}