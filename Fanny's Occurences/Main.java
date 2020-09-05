#include <iostream>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    string str;
  getline(cin,str);
  char p;
  cin>>p; 
  string ans="";
    for(int i=0;i<str.length();i++)
    {
      char ch=str[i];
      if(ch==p)
        continue;
      else
        ans=ans+ch;
    }
  cout<<ans;
    return 0;
}