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
    for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
        int max=a[i][j];
    	for(int k=j+1;k<c;k++){
              if(max<a[i][k])
                max=a[i][k];
        }
      cout<<max<<"\n";
      break;
    }
  }
}