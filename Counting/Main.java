#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char a[300];
  int p=0,b=0,c=0,d=0,e=0;
  cin.getline(a,300);
  for(int i=0;a[i]!='\0';i++){
     if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
       p++;
    else if((a[i]>=65 && a[i]<=92) || (a[i]>=97 && a[i]<=122))
      b++;
    else if(a[i]==' ')
      c++;
    else if(a[i]>='0' && a[i]<='9')
      d++;
    else
      e++;
  }
  cout<<"Vowels:"<<p<<"\n";
  cout<<"Consonants:"<<b<<"\n";
  cout<<"White Spaces:"<<c<<"\n";
  cout<<"Digits:"<<d<<"\n";
  cout<<"Symbols:"<<e<<"\n";
  
}