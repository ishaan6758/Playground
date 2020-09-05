#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() 
{
   int m,n;
   cin>>m>>n;
  int res=0;
  int arr[n];
  vector <int> v;
  
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  sort(arr,arr+n);
  int k=0;
  for(int j=1;j<=m;j++)
  {
     if(j!=arr[k])
     {
      v.push_back(j);
     }
     else
     {
     	k++;
     }
   }
  int i=0;
  for(i=0;i<v.size();i++)
  {
       res=res+v[i];
    if(res>m)
    {
    	break;
	}
  }
  cout<<i;
    return 0;
}