#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
}s;
int main() 
{
   //Your code goes here
  cin.get(s.name,50);
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\n"<<"Name: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
}