#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char s[150];
  cin>>s;
  for(int i=0;s[i]!='\0';i++){
    if((s[i]>=65 && s[i]<=92) || (s[i]>=97 && s[i]<=122))
      cout<<s[i];
  }
}