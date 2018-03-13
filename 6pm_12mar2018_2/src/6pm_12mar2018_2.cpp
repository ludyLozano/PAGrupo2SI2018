//============================================================================
// Name        : 6pm_12mar2018_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int f1(int *a) {
	*a = *a + 1;

	return *a;
}

int f2(int b[]) {
	b[0] = b[0] + 1;

	return b[0];
}

int main() {
	int x1 = 10;
	int x2[] = { 10 };
	f1(&x1);
	cout<<"Resultado en f1: "<<x1<<endl;  //Daniela:10, Alejandra:11
	f2(x2);
	cout<<"Resultado en f2: "<<x2[0]<<endl; //Jhonatan:11, Tatiana:11

	return 0;
}
