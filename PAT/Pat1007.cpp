#include<iostream>
#include <vector>
using namespace std;
int main(){
    int n,judge,num=0;
    vector<int> a;
    cin>>n;

    for(int i=1;i<=n;++i){
        judge=1;
        for(int j=2;j*j<=i;++j){
            if(i%j==0){
                judge=0;
                break;
            }
        }
        if(judge)
            a.push_back(i);
    }

    for(int i=1;i<a.size();i++){

        if(a[i]-a[i-1]==2){
            num++;
        }

    }
    cout<<num;
    return 0;
}
