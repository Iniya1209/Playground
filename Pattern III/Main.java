#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  for(int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
      cout<<i;
      if(j!=i-1)
        cout<<"*";
    }
    cout<<"\n";
  }
  for(int i=n;i>=1;i--){
    for(int j=0;j<i;j++){
      cout<<i;
      if(j!=i-1)
        cout<<"*";
    }
    cout<<"\n";
  }
}