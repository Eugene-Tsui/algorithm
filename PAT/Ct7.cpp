//PAT1031
#include <iostream>
#include <string>
using namespace std;
int main(){
    int weight[17]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
    char M[11]={'1','0','x','9','8','7','6','5','4','3','2'};
    int n;
    cin>>n;
    string a;
    int flag=1;
    for(int i=0;i<n;i++){
        int sum=0;

        int is_wrong=0;
        cin>>a;
        for(int j=0;j<17;j++){
            if(a[j]<'0'||a[j]>'9'){
                cout<<a<<endl;
                is_wrong=1;
                flag=0;
                break;
            }
            else
                sum+=(a[j]-'0')*weight[j];
        }
        int z=sum%11;
        char right=M[z];
        if(a[17]!=right&&is_wrong==0){
            flag=0;
            cout<<a<<endl;
        }

    }
    if(flag)
        cout<<"All passed"<<endl;
    return 0;
}
