#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  if(a==1)
    printf("%0.2f",b);
  if(a==2){
    float t=b+b*0.5;
    printf("%0.2f",t);}
  if(a==3){
    float t=2*b;
    printf("%0.2f",t);}
  if(a>3)
    cout<<"Number of items is more";
}