//PAT1092	最好吃的月饼
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;
bool cmp(int a,int b){
    return a>b;
}
int main(){
    int n,m,i,j,k;
    int a[1000][100];
    int sum[1000];
    int x;
    scanf("%d %d",&n,&m);
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            scanf("%d",&a[i][j]);
            sum[j]+=a[i][j];
        }
    }
    sort(sum,sum+n,cmp);
    printf("%d\n",sum[0]);
    for(i=0;i<n;i++){

        for(j=0;j<m;j++){
            x+=a[j][i];
        }
        if(sum[0]==x){
            printf("%d",i+1);
            if(i!=(n-1))
                printf(" ");
            x=0;
        }
        else
            x=0;

    }
}
