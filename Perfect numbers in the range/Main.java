#include<iostream>
using namespace std;
int main(){
  int a,b;
  cin>>a>>b;
  for(int i=a;i<=b;i++){
    int t=i;
    int s=0;
    for(int j=1;j<t;j++){
      if(t%j==0)
        s+=j;
    }
    if(s==t)
      cout<<t<<" ";
  }
}