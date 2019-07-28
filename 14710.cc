#include <iostream>
using namespace std;
/* 시침은 2분에 1도, 분침은 2분에 12도 욺직임. 
    (시침 % 30) * 12 == 분침            */
int main(void){
    int h, m;
    cin >> h >> m;
    if((h % 30) * 12 == m)
        cout << "O";
    else
        cout << "X";
    return 0;
}