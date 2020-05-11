#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,t,a,flag=0,b;
  cin>>n>>m>>t;
  a=n*2+1;
  b=n*(m-1)+1;
  for(int i=a-n;i<a;i++){
    if(i==t){
      flag=1;
      break;
    }
  }
  for(int i=b-n;i<b;i++){
    if(i==t){
      flag=1;
      break;
    }
  }
  if(flag==1)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}