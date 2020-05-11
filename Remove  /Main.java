#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int p;
  getline(cin,s);
  string word="the ";
  while ((p = s.find("the")) != -1) 
       s.replace(p, word.length(), "");
  cout<<s;
}