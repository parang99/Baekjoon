#include <iostream>
using namespace std;

int main(void){
    int c, k, p;
    int sum = 0;
    cin >> c >> k >> p;
    for(int i = 1;i <= c;i++){
        sum = sum + k * i + p * i * i;
    }
    cout << sum;
    return 0;
}