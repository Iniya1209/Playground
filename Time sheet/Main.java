#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g;
  cin>>a>>b>>c>>d>>e>>g>>f;
  int i=a+b+c+d+e+f+g;
  float s=b*100+c*100+d*100+e*100+g*100;
  if(i<=40){
    if(a>8){
      int j=a-8;
      a=a*100+j*15;
      s=s+a*100+a*0.50;
    }
    else{
      s=s+a*100+a*100*0.50;
    }
    if(f>8){
      int j=f-8;
      f=f*100+j*15;
      s=s+f+f*0.25;
    }
    else{
      s=s+f*100+f*100*0.25;
    }
    if(b>8){
      int j=b-8;
      s=s+j*15;
    }
    if(c>8){
      int j=c-8;
      s=s+j*15;
    }
    if(d>8){
      int j=d-8;
      s=s+j*15;
    }
    if(g>8){
      int j=g-8;
      s=s+j*15;
    }
    if(e>8){
      int j=e-8;
      s=s+j*15;
    }
  }
  else{
    if(a>8){
      int j=a-8;
      s=s+a*100+j*15;
    }
    else{
      s=s+a*100+a*100*0.50;
    }
    if(f>8){
      int j=f-8;
      f=f*100+j*15;
      s=s+f;
    }
    else{
      s=s+f*100+f*100*0.25;
    }
    if(b>8){
      int j=b-8;
      s=s+j*15;
    }
    if(c>8){
      int j=c-8;
      s=s+j*15;
    }
    if(d>8){
      int j=d-8;
      s=s+j*15;
    }
    if(g>8){
      int j=g-8;
      s=s+j*15;
    }
    if(e>8){
      int j=e-8;
      s=s+j*15;
    }
  }
  cout<<s;
}
