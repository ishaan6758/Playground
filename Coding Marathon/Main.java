#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
   int n;
  cin>>n;
  
  int k;
  cin>>k;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  
  sort(a,a+n);
  int sum=0;
  for(int i=n-1;i>=0,k>0;i--,k--)
  {
    sum+=a[i];
  }
  cout<<sum;
    return 0;
}