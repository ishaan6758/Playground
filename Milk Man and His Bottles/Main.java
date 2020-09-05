#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here
  int t;
  int coins[4]={1,5,7,10};
  int dp[10001];
  cin>>t;
  while(t--)
  {
	int n;
    cin>>n;
    memset(dp,-1,sizeof(dp));
    
    dp[0]=0;
 
    
    for(int i=1;i<=n;i++)
    {
      dp[i]=INT_MAX;
      int res=INT_MAX;
      
      for(int j=0;j<4;j++)
      {
        if(i-coins[j]>=0)
          res=dp[i-coins[j]];
        
        if(res!=INT_MAX)
          dp[i]=min(dp[i],res+1);
      }
    }
    cout<<dp[n]<<endl;
  }
  return 0;
}