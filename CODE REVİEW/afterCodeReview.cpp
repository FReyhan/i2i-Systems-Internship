#include <iostream>
#include <math.h>

using namespace std;

bool isPrime(int a) {
    
    bool isItPrime = false;

    if (a == 0 || a == 1) {
        isItPrime = true;
    }
    else {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isItPrime = true;
                break;
            }
        }
    }
    return isItPrime;
}

bool isPerfectSquare(int a) {
    
    int s = sqrt(a);
    
    if (pow(s,2) == a) {
        return true;
    }
    else {
        return false;
    }
}

//One of the methods for finding Fibonacci Number
bool isFibonacci(int a) {

    int testCase1 = 5 * a * a + 4;
    int testCase2 = 5 * a * a - 4;
    
    if (isPerfectSquare(testCase1) || isPerfectSquare(testCase2)) {
        return true;
    }
    else {
        return false;
    }
}



int main() {
    
    int numberUpperBound = 15;

    for (int i = 1; i <= numberUpperBound; i++) {
        if (!isPrime(i) && isFibonacci(i)) {
            cout << i << " is Prime Number and Exist in Fibonacci" << endl;
        }
        else if (!isPrime(i)){
            cout << i << " is Prime Number but not Exist in Fibonacci" << endl;
        }
        else if (isFibonacci(i)) {
            cout << i << " is not Prime Number but Exist in Fibonacci" << endl;
        }
        else {
            cout << i << " is not Prime Number and not Exist in Fibonacci" << endl;
        }
    }

    return 0;
}



