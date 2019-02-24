//PAT1026
#include <cstdio>
#include <cmath>
using namespace std;
int main(){
    int clk=100;
    double a,b;
    scanf("%lf %lf",&a,&b);
    int s = (int)round((b-a)/100);
    int mins=0;
    int h=0;

    h=s/3600;
    s=s%3600;
    mins=s/60;
    s=s%60;
    printf("%02d:%02d:%02d",h,mins,s);

    return 0;
}
