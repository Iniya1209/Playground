#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char a[150];
  int c=0;
  cin.getline(a,150);
   for(int i=0;i<strlen(a);i++){
      if(a[i]==' ')
        c++;
   }
  if(c<10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}