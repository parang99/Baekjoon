#include <iostream>

int main(void){
    int n;
    char c;
    std::cin >> n;
    switch(n % 8){
        case 1:
            c = '1'; break;
        case 2: case 0: 
            c = '2'; break;
        case 3: case 7:
            c = '3'; break;
        case 4: case 6:
            c = '4'; break;
        case 5:
            c = '5'; break;
    }
    std::cout << c;
    return 0;
}