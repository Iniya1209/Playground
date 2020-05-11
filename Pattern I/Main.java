#include<iostream>
using namespace std;
int main(){
  int n,temp;
  cin>>n;
  for(int i=1;i<=4;i++){
    for(int j=0;j<i;j++){
      cout<<n;
    }
    n++;
    cout<<"\n";
  }
  for(int i=4;i>=1;i--){
    n--;
    for(int j=0;j<i;j++){
      cout<<n;
    }
    cout<<"\n";
  }
}