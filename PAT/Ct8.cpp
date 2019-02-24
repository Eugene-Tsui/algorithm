//PAT1091 8·Ö
#include <iostream>
#include <string>
using namespace std;
int main(){
    int m;
    cin>>m;
    int a;
    for(int i=0;i<m;i++){
        int n;
        cin>>n;
        int tihuan=n,len=0;
        while(tihuan){
            tihuan/=10;
            len++;
        }
        int com=0;
        int ch=1;
        int en=0;
        if(len==1){
            for(int j=0;j<10;j++){
                if(ch){
                    com=j*n*n;
                    if(com%10==n%10){
                        cout<<j<<" "<<com<<endl;
                        ch=0;
                    }
                    en++;
                }
            }
            if(en==10)
                cout<<"No"<<endl;
        }else if(len==2){
            for(int j=0;j<10;j++){
                if(ch){
                    com=j*n*n;
                    if(com%10==n%10 && (com/10)%10==n/10)
                        {
                        cout<<j<<" "<<com<<endl;
                        ch=0;
                    }
                    en++;
                }
            }
            if(en==10)
                cout<<"No"<<endl;
        }else if(len==3){
            for(int j=0;j<10;j++){
                if(ch){
                    com=j*n*n;
                    if(com%10==n%10 && (com/10)%10==n/10 && (com/100%10)==com/100){
                        cout<<j<<" "<<com<<endl;
                        ch=0;
                    }
                    en++;
                }
            }
            if(en==10)
                cout<<"No"<<endl;
        }
    }
    return 0;
}
