//============================================================================
// Name        : 6pm_12mar2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void EvaluaCantidadVocalesTilde();
bool EsTildada(char evaluado);

int main() {

	EvaluaCantidadVocalesTilde();

	return 0;
}

void EvaluaCantidadVocalesTilde() {
	char cadena[16] = "";
	char caracter = '\0';
	int cantidadtildadas = 0;
	int i = 0;

	cout<<"Entre cadena: ";
	cin.getline(cadena,16);

	i = 0;
	while(cadena[i]) {
		caracter = cadena[i++];

		if(EsTildada(caracter))
			cantidadtildadas++;
	}

	cout<<"Cantidad de Tildes: "<<cantidadtildadas;
}

bool EsTildada(char evaluado) {
	bool resultado = false;
	char tildes[5] = {'Á','É','Í','Ó','Ú'};
	int i = 0;

	while(tildes[i]) {

		if(toupper(evaluado) == toupper(tildes[i++])) {
			cout<<evaluado;
			resultado = true;
			break;
		}
	}

	return resultado;
}
