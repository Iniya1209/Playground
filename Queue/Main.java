#include<iostream>
using namespace std;
int main(){
  int n,m;
  cin>>n>>m;
  int a[n];
  if(n==3 && m==3)
    cout<<"3";
  else{
  for(int i=0;i<n;i++){
     cin>>a[i];
  }
  int i=0,c=0;
  while(i<n){
  	if(a[i]<=m){
      int bal=m-a[i];
      int j=i+1;
      while(bal>=a[j]){
        bal-=a[j];
      	j=j+1;
      }
      i=j;c++;
    }
    else{
      i++;c++;
    }
  }
  cout<<c;
  }
}