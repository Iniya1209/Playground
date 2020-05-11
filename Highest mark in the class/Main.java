#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  int max;
  max=a[0];
  for(int j=0;j<n;j++){
    if(max<a[j])
      max=a[j];
  }
  cout<<max;
}