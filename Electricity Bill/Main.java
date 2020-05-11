#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  int h;
  if(a<=200){
    h=a*0.5;
    cout<<"Rs."<<h;}
  else if(a<=400){
    h=a*0.65;
    cout<<"Rs."<<h;}
  else if(a<=600){
    h=a*0.80+200;
    cout<<"Rs."<<h;}
  else{
    h=a*1.25+425;
    cout<<"Rs."<<h;}
}