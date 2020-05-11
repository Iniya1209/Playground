#include<iostream>
using namespace std;
int main(){
  float n,a=0.5,b=1.5,t=3,s=0;
  cin>>n;
  if(n==1)
    cout<<a;
  if(n==2){
    cout<<a<<" ";
    cout<<b<<" ";}
  if(n>2){
    cout<<a<<" ";
    cout<<b<<" ";
    for(int i=2;i<n;i++){
      b=b+t;
      t=t*3;
      cout<<b<<" ";
    }
  }
}