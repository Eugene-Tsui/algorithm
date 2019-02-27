#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<int> a;
    int n,m,ex;
    cin>>n>>m;
    m%=n;
    for(int i=0;i<n-m;++i){
        cin>>ex;
        a.push_back(ex);
    }
    for(int i=0;i<m;++i){
        cin>>ex;
        a.insert(a.begin()+i,ex);
    }
    for(int i=0;i<n;++i){
        if(i==0)
            cout<<a[i];
        else
            cout<<" "<<a[i];
    }
    return 0;
}
