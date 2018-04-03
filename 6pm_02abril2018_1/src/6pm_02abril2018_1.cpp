//============================================================================
// Name        : 6pm_02abril2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Materia {
	int id;
	char referencia[16];
};

struct Estudiante {
	int codigo;
	char nombre[16];
	Materia *materias;
};


int main() {
	int cantestudiantes = 0;
	int cantmaterias = 0;
	Estudiante *estudiantes = NULL;
	Materia *materias = NULL;

	cout<<"Entre cantidad de Estudiantes: "<<endl;
	cin>>cantestudiantes;

	estudiantes = (Estudiante *) malloc(cantestudiantes * sizeof(Estudiante));
	for(int i=0; i < cantestudiantes; i++) {
		cout<<"Entre codigo del estudiante ("<<i+1<<"): "<<endl;
		cin>>estudiantes[i].codigo;
		cin.ignore();
		cout<<"Entre nombre del estudiante ("<<i+1<<"): "<<endl;
		cin.getline(estudiantes[i].nombre,16);
		estudiantes[i].materias = NULL;
		cout<<"Entre cantidad de Materias: "<<endl;
		cin>>cantmaterias;

		materias = (Materia *) malloc(cantmaterias * sizeof(Materia));
		for(int j=0;j<cantmaterias;j++) {
			cout<<"Entre id de la materia ("<<j+1<<"): "<<endl;
			cin>>materias[j].id;
			cin.ignore();
			cout<<"Entre referencia de la materia ("<<j+1<<"): "<<endl;
			cin.getline(materias[j].referencia,16);
		}
		estudiantes[i].materias = materias;
		materias = NULL;
	}

	//mostrar los datos

	//Debida liberacion de los espacios de memoria usados
	for(int i=0; i < cantestudiantes; i++) {
		free(estudiantes[i].materias);
		estudiantes[i].materias = NULL;
	}
	free(estudiantes);
	estudiantes = NULL;

	return 0;
}
