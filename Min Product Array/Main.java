#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
  int k;
  cin>>n>>k;
  int a[n];
  int b[n];
    for(int i=0;i<n;i++)
    {
      cin>>a[i];
    }
  for(int j=0;j<n;j++)
    cin>>b[j];
  
  long long int org=0;
  for(int i=0;i<n;i++)
    org+=(a[i]*b[i]);
  
  long long int dp[n+1];
  
  for(int i=0;i<n;i++)
  {
    dp[i]=org;
    long long origp=a[i]*b[i];
    long long int a1=a[i]+2*k;
    a1*=b[i];
    long long int a2=a[i]-2*k;
    a2*=b[i];
    a1-=origp;
    a1+=org;
	a2-=origp;
    a2+=org;
    dp[i]=min(dp[i],min(a1,a2));
  }
  long long int ans=INT_MAX;
  for(int i=0;i<n;i++)
    ans=min(ans,dp[i]);
  
  cout<<ans;
    return 0;
}