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

int main() {

	void (*pf)(int) = f1;

	pf(120);

	return 0;
}
