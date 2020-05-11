#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,o,v;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++){
     cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>o;
  if(o>n)
    cout<<"Invalid Input";
  else{
     cout<<"Enter the value to insert\n";
  cin>>v;
    cout<<"Array after insertion is\n";
  for(int i=0;i<n;i++){
    if(i==o-1)
      cout<<v<<"\n";
    cout<<a[i]<<"\n";
  }
  }
}