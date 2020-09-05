#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n;
  cin>>n;
  
  int five=0;
  int one=0;
  int two=0;
  
  five=(n-4)/5;
  
  int help=(n-five*5);
   if(help%2==0)
     one=2;
  	else
      one=1;
   two=(n-five*5-one*1)/2;
  int total=one+five+two;
  cout<<total<<" "<<five<<" "<<two<<" "<<one;
  return 0;
}