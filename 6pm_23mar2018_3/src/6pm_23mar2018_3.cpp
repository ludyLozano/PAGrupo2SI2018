//============================================================================
// Name        : 6pm_23mar2018_3.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string.h>
using namespace std;

struct Cliente {
	int nit;
	char razonsocial[16];
};

int main() {
	int cantidadclientes = 2;
	Cliente *clientes = (Cliente *) malloc(cantidadclientes * sizeof(Cliente));

	clientes[0].nit = 100;
	strcpy(clientes[0].razonsocial,"lulu");

	clientes[1].nit = 200;
	strcpy(clientes[1].razonsocial,"oscar");

	for(int i = 0;i<cantidadclientes; i++) {
		cout<<"nombre del cliente ("<<i+1<<"): "<<clientes[i].razonsocial<<endl;
	}

	free(clientes);
	clientes = NULL;

	return 0;
}
