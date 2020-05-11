#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s[100];
  int i;
  for(i=0;s[i-1]!="####";i++){
     cin>>s[i];
  }
  cout<<s[0]<<"\n";
  for(int j=0;j<i;j++){
    if(s[j].back()==s[j+1].front())
      cout<<s[j+1]<<"\n";
  }
}