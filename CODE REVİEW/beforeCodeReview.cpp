#include <iostream>
#include <math.h>
using namespace std;


bool is_Prime(int a){
    bool isItPrime = true;
    
    if (a == 0 || a == 1) {
        isItPrime = false;
    }
    else {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isItPrime = false;
                break;
            }
        }
    }
    return isItPrime;
}

bool isPerfectSquare(int x){
    int s = sqrt(x);
    if(s*s==x){
        return true;
    }
    else{
        return false;
    }
}
 

bool isFibonacci(int a){
    if(isPerfectSquare(5*a*a + 4) || isPerfectSquare(5*a*a - 4)){
        return true;
    }
    else{
        return false;
    }
}



int main() {
   int number=15;
   
   for(int i=1;i<=number;i++){
   if(is_Prime(i)==1 && isFibonacci(i)==1){
     cout<<i<<" is Prime Number and Exist in Fibonacci"<<endl;   
    }
   }

    return 0;
}


