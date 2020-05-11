#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=0,b=0,t;
  cin>>n;
  for(int i=0;i<n;i++){
    cin>>t;
    if(t%2==0)
      a=a+t;
    else
      b=b+t;
  }
  cout<<"The sum of the even numbers in the array is "<<a;
  cout<<"\nThe sum of the odd numbers in the array is "<<b;
}