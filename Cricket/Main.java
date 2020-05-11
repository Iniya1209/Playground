#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int o,crr,trr,cb,cr;
  cin>>o>>trr>>cr>>cb;
  cout<<o/6<<"\n";
  float i=(cb/6)+(cb%6)/10.0;
  cout<<i<<"\n";
  float t=cr/i;
  printf("%.1f\n",t);
  float h=trr/(o/6.0);
  printf("%.1f\n",h);
  if(i<h)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}