#include<iostream>
using namespace std;
#include<cmath>
int main(){
  int m,n,r;
  cin>>m>>n>>r;
  int t=pow(m,n);
  if(t<r)
    cout<<"Sorry Doctor! You need more bacteria.";
  else
    cout<<"Doctor, you can proceed with your experiment.";
}