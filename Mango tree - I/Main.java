#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    int n,m,t,a,flag=0,b;
  cin>>n>>m>>t;
  for(int i=1;i<n;i++){
    if(i==t){
      flag=1;
      break;
    }
  }
  for(int i=1;i<m;i++){
    if(i==t){
      flag=1;
      break;
    }
  }
  if(t%m==1 || t%m==0)
    flag=1;
   
  if(flag==1)
    cout<<"Yes";
  else
    cout<<"No";
}
