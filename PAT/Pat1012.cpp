#include <cstdio>
int main(){
    int n,a1=0,a2=0,a3=0,a5=0,x1=1,x2=0,y1=0,y2=0,y3=0,y4=0,y5=0;
    double a4=0.0;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int a;
        scanf("%d",&a);
        if(a%5==0&&a%2==0){
            a1+=a;
            y1++;
        }

        if(a%5==1){
            a2+=(x1*a);
            x1*=(-1);
            y2++;
        }
        if(a%5==2){
            a3++;
            y3++;
        }
        if(a%5==3){
            a4+=(double)a;
            x2++;
            y4++;
        }
        if(a%5==4){
            if(a5<a)a5=a;
            y5++;
        }
    }
    if(y1!=0) printf("%d",a1);
        else printf("N");
    if(y2!=0) printf(" %d",a2);
        else printf(" N");
    if(y3!=0) printf(" %d",a3);
        else printf(" N");
    if(y4!=0) printf(" %.1f",a4/x2);
        else printf(" N");
    if(y5!=0) printf(" %d",a5);
        else printf(" N");
}
