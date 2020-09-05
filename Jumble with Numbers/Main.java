#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int a;
  int b;
  int m;
  
  cin>>a>>b>>m;
  if(m<0 || a<0 || b<0)
  {
    cout<<"Invalid Input";
    return 0;
  }
  if(isdigit(m))
  {
    cout<<"Invalid Input";
    return 0;
  }
  int count=0;
  for(int i=1;i<=1000;i++)
  {
    int temp=i*(2*i-1);
    if(temp>=a&& temp<=b)
    {
      count++;
    }
  	if(count==m)
    {
      cout<<temp;
      break;
    }
  }
  if(count!=m)
    cout<<"No number is present at this index";
  return 0;
}