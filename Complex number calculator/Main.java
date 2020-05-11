#include<iostream>
using namespace std;
int main(){
  int a,b,c,d,n;
  cin>>n>>a>>b>>c>>d;
  if(n==1){
      int x=a+c;
      int y=b+d;
      if(y<0){
         y=y*(-1);
         cout<<x<<"-"<<y<<"i";}
      else
        cout<<x<<"+"<<y<<"i";
    }
    else if(n==2){
      int x=a-c;
      int y=b-d;
      if(y<0){
         y=y*(-1);
         cout<<x<<"-"<<y<<"i";}
      else
        cout<<x<<"+"<<y<<"i";
     }
  else if(n==3){
  	int x=(a*c)-(b*d);
    int y=(a*d)+(c*b);
     if(y<0){
         y=y*(-1);
         cout<<x<<"-"<<y<<"i";}
      else
        cout<<x<<"+"<<y<<"i";
  }
    else
      cout<<"Invalid choice";
}