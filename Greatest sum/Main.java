#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  int g[r],h[c],x=0,y=0;
  for(int i=0;i<c;i++){
  	for(int j=0;j<r;j++){
        int max=a[j][i];
    	for(int k=j+1;k<r;k++){
              max+=a[k][i];
        }
      h[x++]=max;
      break;
    }
  }
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
        int max=a[i][j];
    	for(int k=j+1;k<c;k++){
              max+=a[i][k];
        }
      g[y++]=max;
      break;
    }
  }
  cout<<"Sum of rows is ";
  int max=g[0];
  int j=0;
  for(int i=0;i<y;i++){
  	cout<<g[i]<<" ";
    if(g[i]>max){
      max=g[i];j=i;}
  }
  cout<<"\n";
  cout<<"Row "<<j+1<<" has maximum sum";
  cout<<"\n";
  cout<<"Sum of columns is ";
   max=h[0];
  j=0;
  for(int i=0;i<x;i++){
  	cout<<h[i]<<" ";
    if(h[i]>max){
      max=h[i];j=i;}
  }
  cout<<"\n";
  cout<<"Column "<<j+1<<" has maximum sum";
}