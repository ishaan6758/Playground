#include <iostream>
#include<bits/stdc++.h>
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
	string str;
  	getline(cin,str);
  
  string ans="";
  	int f;
  int count;
  for(auto i:str)
  {
    if(i==' ')
    {
      count+=Pallindrome(ans);
      //count+=f;
      ans="";
    }
    else
      ans=ans+i;
  }
  count+=Pallindrome(ans);
  cout<<count;
}