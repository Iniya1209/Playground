#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
  	cin>>a[i];
  }
  cout<<"1\n";
  for(int i=1;i<n;i++){
  	if(a[i]<=a[i-1])
      cout<<"1"<<"\n";
    else{
      c=c+2;
      cout<<c<<"\n";
    }
  }
}