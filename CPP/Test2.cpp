#include<stdio.h>
int main()
{
    int i,j,n,a[10000],mix=10000,max;
    scanf("%d",&n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(i=0;i<n;i++)
        for(j=0;j<i;j++)
    {
        if(a[i]-a[j]==0)
        {
            mix=0;
            break;
        }
        if((a[i]-a[j])>0)
            {
                max=a[i]-a[j];
                if(max<mix)
                    mix=max;
            }
            else
            {
                max=a[j]-a[i];
                if(max<mix)
                    mix=max;
            }
    }
    printf("%d\n",mix);
    return 0;
}
