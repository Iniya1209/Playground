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
  for(int i=0;i<c;i++){
  	for(int j=0;j<r;j++){
        int max=a[j][i];
    	for(int k=j+1;k<r;k++){
            if(max<a[k][i])
              max=a[k][i];
        }
      cout<<max;
      break;
    }
    cout<<"\n";
  }
}