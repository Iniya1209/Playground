#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  int i,s,g;
  cin>>a>>b>>c;
  if(a>b && a>c){
    if(b>c)
      s=b;
   else
     s=c;
  }
  else if(b>c){
    if(a>c)
      s=a;
    else
      s=c;
  }
  else{
    if(a>b)
      s=a;
    else
      s=b;
  }
  i=a<b?(a<c?a:c):(b<c?b:c);
  for(g=i;g>1;g--){
    if(a%g==0 && b%g==0 && c%g==0)
      break;
  }
  cout<<"The treasure is in box which has number "<<s<<"\n";
  cout<<"The code to open the box is "<<g;
}