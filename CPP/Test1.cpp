//编写函数实现3个字符串连接的功能,并将生成的新字符串的首地址作为函数返回值.编写主函数main()，从键盘输入不同字符串对函数进行测试。
#include <iostream>
#include <string>
using namespace std;
string add(string s1,string s2,string s3){
    return s1+s2+s3;
}
int main(){
    string s1,s2,s3;

    cin>>s1;
    cin>>s2;
    cin>>s3;

    cout<<add(s1,s2,s3)<<endl;
    return 0;
}
