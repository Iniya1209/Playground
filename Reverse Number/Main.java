#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int r=0,n,t;
  cin>>n;
  while(n){
    t=n%10;
    r=r*10;
    r=r+t;
    n=n/10;
  }
  cout<<r;
	return 0;
}