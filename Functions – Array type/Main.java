#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=0,b=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int t[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++){
     cin>>t[i];
  }
  for(int i=0;i<n;i++){
    if(t[i]%2==0)
      a++;
    else
      b++;
  }
  if(a>0 && b==0)
    cout<<"The array is Even";
  else if(b>0 && a==0)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}