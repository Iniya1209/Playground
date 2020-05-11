#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,k,flag=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  cin>>k;
  for(int i=0;i<n;i++){
    if(a[i]==k){
      flag=1;
      break;
    }
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}