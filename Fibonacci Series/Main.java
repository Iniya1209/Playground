#include<iostream>
using namespace std;
int fib(int);
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-1);
}
int fib(int x){
if(x==0 || x==1)
  return x;
else
  return fib(x-1)+fib(x-2);
}