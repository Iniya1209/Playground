#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s1;
  int n1;
  cin>>s1>>n1;
  if(n1==1){
    if(s1=="rear")
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  else{
    if(s1=="front")
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}