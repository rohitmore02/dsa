#include<iostream>
#include<string>

using namespace std;

void printName(string name) {
    cout << "Hello " << name << endl;
}

int sum(int num1, int num2) {
    return num1 + num2;
}

int maxx(int num1, int num2) {
    if (num1 > num2) return num1;
    else return num2;
}

int mini(int num1, int num2) {
    if (num1 < num2) return num1;
    else return num2;
}

// Pass by value
int increamentByFive(int num) {
    cout << num << endl;
    num +=5;
    cout << num << endl;
    num +=5;
    cout << num << endl;
}

// Pass by reference
int increamentRefByFive(int &num) {
    cout << num << endl;
    num +=5;
    cout << num << endl;
    num +=5;
    cout << num << endl;
}

int main() {

    // string name;
    // cin >> name;

    // printName(name);

    // int num1, num2;
    // cin >> num1 >> num2;

    // int total = sum(num1, num2);
    // cout << total;

    // int maximum = maxx(num1, num2);
    // cout << maximum;

    // int minimum = mini(num1, num2);
    // cout << minimum;

    int num;
    cin >> num;

    increamentByFive(num);
    cout << num << endl;

    increamentRefByFive(num);
    cout << num << endl;

    return 0;
}