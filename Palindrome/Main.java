#include <iostream>
using namespace std;
int Pallindrome(string s)
{
  int i=0;
  int j=s.length()-1;
  
  while(i<j)
  {
    if(s[i]!=s[j])
      return 0;
    
    i++;
    j--;
  }
  return 1;
}
int main() 
{
   // Try out your code here
   	string s;
  cin>>s;
  
  cout<<Pallindrome(s);
    return 0;
}