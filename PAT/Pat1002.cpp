#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main(){
    string n;
    string a[10] =  {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    cin>>n;
    int j=0,sum=0;
    int x[100]={0};
    for(int i=0;i<n.size();i++){
        sum+=(n[i]-'0');
    }
    while(sum){
        x[j++]=sum%10;
        sum/=10;
    }
    cout<<a[x[--j]];
    while(j>0){
        cout<<" "<<a[x[--j]];
    }
    return 0;
}
