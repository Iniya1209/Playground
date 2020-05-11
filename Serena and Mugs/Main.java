#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,S=0;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++){
  	cin>>a[i];
  }  
  for(int i=0;i<n;i++){
      S=S+a[i];
  }
  if(S<=s)
    cout<<"YES";
  else
    cout<<"NO";
}