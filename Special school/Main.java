#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s[150],d[150];
  cin>>s>>d;
  int t=strlen(d)-1,flag=0;
  for(int i=0;i<strlen(s);i++){
    if(s[t--]==d[i])
      flag=0;
    else{
      flag=1;break;}
  }
  if(flag==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}