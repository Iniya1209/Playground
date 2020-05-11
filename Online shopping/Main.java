#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int x=a-(a*b/100)+c;
  int y=d-(d*e/100)+f;
  int z=g-(g*h/100)+i;
  cout<<"In Flipkart Rs."<<x<<"\n";
  cout<<"In Snapdeal Rs."<<y<<"\n";
  cout<<"In Amazon Rs."<<z<<"\n";
  if(x<=y && x<=z)
    cout<<"He will prefer Flipkart";
  else if(y<=x && y<=z)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}