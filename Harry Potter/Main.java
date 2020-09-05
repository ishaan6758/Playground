#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int first;
  int temp=n;
  int count=4;
  while(n>0)
  {
    int t=n%10;
    if(count==1)
      first=t;
     n=n/10;
    count--;
  }
  int last=temp%10;
  int ans=first+last;
	cout<<ans;
}