#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
	int t;
  cin>>t;
  while(t--)
  {
    string s;
    cin>>s;
    
    map<char,int> mp;
    for(int i=1;i<=26;i++)
      mp[(char)97]=1;
    
    map<char,int> mp2;
    int n=s.length();
    for(int i=0;i<n;i++)
    {
      mp2[s[i]]++;
    }
    int flag=0;
    for(auto it:mp2)
    {
      char a=it.first;
      int b=it.second;
      
      int d=a-'a'+1;
     // cout<<d<<b<<endl;
      if(d!=b)
        flag=1;
    }
    if(flag==0)
      cout<<"YES"<<" ";
    else
      cout<<"NO"<<" ";
      
  }
    return 0;
}