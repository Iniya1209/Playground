#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int temp,c=0;
  cin>>temp;
  while(temp>1){
    cout<<temp<<"\n";
    if(temp%2==0)
      temp=temp/2;
    else
      temp=3*temp+1;
    c++;
  }
  cout<<1<<"\n";
  cout<<c;
}