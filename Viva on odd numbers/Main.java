#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,c=0;
  float s=0.0;
  while(1){
    cin>>a;
    if(a%2==1){
      s+=1;
      c+=1;
    }
    if(a%2==0 && a>0){
      s=s-0.5;
    }
    if(a<0){
      s-=1.0;
      break;
    }
    if(c==3)
      break;
  }
  printf("%.1f",s);
}