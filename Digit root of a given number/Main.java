#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  if(n%9!=0)
    cout<<n%9;
  else
    cout<<"9";
}