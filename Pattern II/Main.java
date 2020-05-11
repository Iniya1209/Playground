#include<iostream>
using namespace std;
int main(){
  int n,t=1,l=1;
  cin>>n;
  for(int i=1;i<=n;i++){
    if(i%2==1){
      for(int j=0;j<i;j++){
        cout<<l++;
        if(j!=i-1)
          cout<<"*";
      }
      t=++l;
    }
    else{
      t=t+(i-2);
      l=t;
      for(int j=i;j>=1;j--){
        cout<<t--;
        if(j!=1)
          cout<<"*";
       }
    }
    l++;
    cout<<"\n";
  }
}