#include<iostream>
using namespace std;
int main(){
  int n,a,b,c,i,g;
  cin>>a>>b>>c>>n;
  i=a<b?(a<c?a:c):(b<c?b:c);
  for(g=i;g>1;g--){
    if(a%g==0 && b%g==0 && c%g==0)
      break;
  }
  if(g==n)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}