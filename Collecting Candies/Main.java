#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here
  int t;
  cin>>t;
  while(t--)
  {
    int n;
    cin>>n;
    
    priority_queue<int, vector<int> , greater<int>> pq;
    int total=0;
    for(int i=0;i<n;i++)
    {
      int a;
      cin>>a;
      pq.push(a);
    }
    
    while(pq.size()!=1)
    {
      int d=pq.top();
      pq.pop();
      int b=pq.top();
      pq.pop();
      total+=b+d;
      pq.push(b+d);
    }
    cout<<total<<endl;
  }
  return 0;
}