#include <cstdio>
#include <cmath>
using namespace std;
int Exchange(int n,int step);
int main(){
    int n;
    scanf("%d",&n);
    printf("%d",Exchange(n,0));
    return 0;
}
int Exchange(int n,int step){
    if(n==1){
        return step;
    }
    else{
        if(n%2==0){
            step++;
            printf("%d\n",step);
            Exchange(n/2,step);

        }

        else{
            step++;
            printf("%d\n",step);
            Exchange((3*n+1)/2,step);

        }

    }

}
