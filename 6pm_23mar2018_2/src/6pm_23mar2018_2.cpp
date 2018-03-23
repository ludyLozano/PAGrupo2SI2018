//============================================================================
// Name        : 6pm_23mar2018_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f1(int i) {
	cout<<"paso x f1: "<<i<<endl;
}
void f2(int i) {
	cout<<"paso x f2: "<<i<<endl;
}

void wrapper(void (*pf1)(int) , int i) {
	pf1(i);
}


int main() {
	void (*pf2)(int) = f1;
	void (*pf3)(int) = f2;

	wrapper(pf3,100);

	return 0;
}
