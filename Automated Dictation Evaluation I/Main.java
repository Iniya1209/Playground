#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s[150],d[150];
  cin>>s>>d;
  if(strcmp(s,d)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}