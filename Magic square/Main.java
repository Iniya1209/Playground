#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,o=0,t=0,x=0,y=0;
  cin>>r;
  c=r;
  int a[r][c],b[r][c];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	if(i==j)
          o+=a[i][j];
    }
  }
  for(int i=0;i<r;i++){
  	for(int j=c-1;j>=0;j--){
    	b[x][y]=a[i][j];
        y++;
    }
    x++;
    y=0;
  }
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	if(i==j)
          t+=b[i][j];
    }
  }
  if(o==t)
  	cout<<"Yes";
  else
    cout<<"No";
}