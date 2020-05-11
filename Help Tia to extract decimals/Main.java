#include<iostream>
#include<string>
int main() 
{ 
  std::string fnum;
  //Type your code hereinclude<iostream>
  std::cin>>fnum;
  int d=fnum.find(".");
  std::cout<<"Floating part is : ";
  if(d!=-1){
    for(int i=d+1;i<fnum.length();i++){
      std::cout<<fnum[i];
    }
  }
}
