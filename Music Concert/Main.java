#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,a,b;
  cin>>n;
  int *p=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++){
     cin>>p[i];
  }
  for(int i=0;i<n;i++){
    if(p[i]%2==0)
      a++;
    else
      b++;
  }
  cout<<b;
  cout<<"\n"<<a;
  return 0;
}