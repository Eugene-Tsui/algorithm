#include <cstdio>
#include <set>
using namespace std;
int main(){
    set<int> st;
    st.insert(3);
    st.insert(2);
    st.insert(5);
    st.insert(3);
    set<int>::iterator it = st.begin();
    for(;it!=st.end();it++){
        printf("%d ",*it);
    }
    printf("\n");

    set<int>::iterator it1 = st.find(5);
    printf("%d ",*it1);
    printf("\n");

    st.erase(st.find(3));
    set<int>::iterator it2 = st.begin();
    for(;it2!=st.end();it2++){
        printf("%d ",*it2);
    }

    return 0;
}
