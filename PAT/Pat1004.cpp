#include <iostream>
#include <string>
using namespace std;
struct student {
    string name,sno;
    int score;
};
int main(){
    int n;
    cin>>n;
    int maxl=-1,minl=101,maxnum=0,minnum=0;
    student student[1000];
    for(int i=0;i<n;i++){
        cin>>student[i].name>>student[i].sno>>student[i].score;
        if(student[i].score>maxl){
            maxl=student[i].score;
            maxnum=i;
        }
        if(student[i].score<minl){
            minl=student[i].score;
            minnum==i;
        }
    }
    cout<<student[maxnum].name<<" "<<student[maxnum].sno<<endl;
    cout<<student[minnum].name<<" "<<student[minnum].sno<<endl;
}
