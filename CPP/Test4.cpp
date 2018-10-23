#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
	int n,z=-1;
	int f[1002];
	scanf("%d",&n);
	for(int i=0;i<n;i++)
		scanf("%d",&f[i]);
	for(int i=0;i<n;i++){
		int a=0;int b=0;
		for(int j=0;j<n;j++){
			if(f[i]>f[j])
				a++;
			else if(f[i]!=f[j])
				b++;
			else continue;
		}
		if(a-b==0){
			z=f[i];
			break;
		}
	}
	printf("%d\n",z);
	return 0;
}
