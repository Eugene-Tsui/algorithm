#include <iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n/100;i++)
        cout<<"B";
    for(int i=0;i<n/10%10;i++)
        cout<<"S";
    for(int i=0;i<n%100%10;i++){
        int x=i+1;
        cout<<x;
    }

    return 0;
}
