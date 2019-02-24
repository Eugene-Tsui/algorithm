
#include <cstdio>
using namespace std;
int extractNum(int A, int DA);
int Number(int A,int DA){
    int res = 0;
    while(A>0) {
        int temp = A%10;
        if(temp == DA) {
            res = res*10 + DA;
        }
        A /= 10;
    }
    return res;
}
int main(){
    int a,b,m,n;
    scanf("%d %d %d %d",&a,&m,&b,&n);
    printf("%d",Number(a,m)+Number(b,n));
    return 0;
}
