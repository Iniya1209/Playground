#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t=0,x=0,y=0;
  cin>>r>>c;
  int a[r][c],b[r][c];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  if(r==2 && c==2){
    for(int i=0;i<c;i++){
    	t+=a[0][i];
        t+=a[r-1][i];
    }
  }
  else{
    for(int i=0;i<c-1;i++){
    	t+=a[0][i];
    }
    for(int i=1;i<c;i++){
    	t+=a[r-1][i];
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
  }
    cout<<"Sum of Zig-Zag pattern is "<<t;
}