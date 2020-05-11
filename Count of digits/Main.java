#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int i,n;
  cin>>n;
  do{
    i++;
    n=n/10;
  }while(n);
   cout<<i;
}