#include<iostream>
using namespace std;
struct employee{
   int eid;
   char name[150];
   int age;
   char design[150];
   float salary;
};
int main()
{
  //Type your code here.
  struct employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.eid;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.design;
  cout<<"Enter Salary:\n";
  cin>>e.salary;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<e.eid<<"\n";
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cout<<"Designation of the Employee : "<<e.design<<"\n";
  cout<<"Salary of the Employee : "<<e.salary<<"\n";
}