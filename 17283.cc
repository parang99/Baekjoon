#include <iostream>
using namespace std;

int main(void){
    int l, r, n = 1;
    int sum = 0;
    cin >> l >> r;
    while(true){
        l = l * r / 100;
        if(l <= 5)
            break;
        n *= 2;
        sum = sum + l * n;
    }
    cout << sum;
    return 0;
}