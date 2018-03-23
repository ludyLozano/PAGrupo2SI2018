//============================================================================
// Name        : 6pm_23mar2018_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f1() {
	cout<<"paso x f1"<<endl;
}

int main() {

	void (*pf)() = f1;

	pf();

	return 0;
}
