#include <iostream>
using namespace std;
void reverse(char *str) {
   if(*str == '\0')
      return;
   else {
      reverse(str+1);
      cout<<*str;
   }
}
int main() {
   char str[100];
   cin.getline(str,100);
   reverse(str);
   return 0;
}