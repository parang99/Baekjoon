#include <iostream>
using namespace std;

int main(void){
    int n;
    int a, b;
    int f13 = 0, f34 = 0, f14 = 0;
    cin >> n;
    
    for(int i = 0;i < n;i++){
        cin >> a >> b;
        if(a == 2 || a == 5 || b == 2 || b == 5){
            n = 0;
            break;
        }
        else if((a == 1 && b == 3) || (a == 3 && b == 1))
            f13++;
        else if((a == 3 && b == 4) || (a == 4 && b == 3))
            f34++;
        else if((a == 1 && b == 4) || (a == 4 && b == 1))
            f14++;
        else ;
    }

    if(f13 > 0 && f34 > 0 && f14 > 0 && n != 0)
        cout << "Wa-pa-pa-pa-pa-pa-pow!";
    else
        cout << "Woof-meow-tweet-squeek";
    return 0;
}