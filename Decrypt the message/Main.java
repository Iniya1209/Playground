#include<iostream>
using namespace std;
int main(){
  int a,b;
  cin>>a>>b;
  int c=a+b;
  int s=0;
  for(int j=1;j<c;j++){
    if(c%j==0)
        s+=j;
    }
    if(s==c)
      cout<<"They can read the message";
    else
      cout<<"They can't read the message";
  }