#include<iostream>
using namespace std;
int main(){
  int n,l;
  cin>>n;
  l=n;
  int t=1,g=n*n+1;
  int k=g=n*n+1;
  for(int i=0;i<n;i++){
    for(int j=0;j<i*2;j++){
       cout<<"-";
    }
    for(int j=n;j>i;j--){
       cout<<t++;
       cout<<"*";
    }  
    for(int j=n;j>i;j--){
       cout<<g++;
       if(j!=i+1)
         cout<<"*";
    }
    k-=(l-1);
    l--;
    g=k;
    cout<<"\n";
  }
  
}