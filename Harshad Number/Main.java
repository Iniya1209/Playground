#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,temp;
  cin>>n;
  temp=n;
  while(n){
    s+=(n%10);
    n/=10;
  }
  if(temp%s==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}