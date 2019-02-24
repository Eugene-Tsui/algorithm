#include <cstdio>
int len(int n);
int main(){
    int m,n,com;
    scanf("%d",&m);
    for(int i=0;i<m;i++){
        scanf("%d",&n);
        int flag=0;
        com=len(n);
        for(int j=0;j<10;j++){
            if((j*n*n-n)%com==0){
                printf("%d %d\n",j,j*n*n);
                flag=1;
                break;
            }
        }
        if(flag==0)
            printf("No\n");
    }
    return 0;
}
int len(int n){
    int len=1;
    while(n){
        len*=10;
        n/=10;
    }
    return len;
}
