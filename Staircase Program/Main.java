#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
  cin>>n;
  
  long long int dp[n+1];
  dp[0]=1;
  dp[1]=1;
  dp[2]=2;
  
  for(int i=3;i<=n;i++)
    dp[i]=dp[i-1]+dp[i-2];
  
  cout<<dp[n];
    return 0;
}