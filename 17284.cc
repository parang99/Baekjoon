#include <iostream>
using namespace std;

int main(void){
    int money = 5000;
    int m;
    do {
        cin >> m;
        if(m == 1)
            money -= 500;
        else if(m == 2)
            money -= 800;
        else
            money -= 1000;
    } while(getc(stdin) == ' ');
    cout << money;
    return 0;
}