#include<iostream>
int pow(int,int);
using namespace std;
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}
int pow(int x,int y){
  if(y==0)
    return 1;
  else{
    return x*pow(x,y-1);
  }
}