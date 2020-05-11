#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d,c,dd,cc;
  cin>>d>>c>>dd>>cc;
  int td=d+dd;
  int tc=(c+cc)/100;
  td=td+tc;
  cout<<td<<"\n";
  cout<<(c+cc)%100;
}