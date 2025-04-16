#include<iostream>
#include<string>

using namespace std;

int main() {

    // integer array
    // int arr[5];

    // cin >> arr[3];
    // cout << arr[3];

    // 2D array
    // int arr2[2][3];

    // cin >> arr2[1][2];
    // cout << arr2[1][2];

    string s = "Rohit";

    int len = s.size();
    s[len - 1] = 'n';
    s[len -2] = 'a';

    cout << s;

    return 0;
}