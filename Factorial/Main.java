#include<iostream>
int fact(int);
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}
int fact(int a){
  if(a==0)
    return 1;
  else
    return a*fact(a-1);
}