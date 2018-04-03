package ejercicio8;

import java.util.Scanner;

public class Matriz {
    int [][] m;
    int tamaño;
    
    Matriz(){
        System.out.print("Introduce el tamaño de la matriz: ");
        Scanner Escaner= new Scanner(System.in);
        tamaño = Escaner.nextInt();
        m = new int [tamaño][tamaño];
    }

    void asignarDatos() {
        int contador=1;
        for(int i=0; i<tamaño; i++){
            for(int j=0; j<tamaño; j++){
                m[i][j]= contador;
                contador++;
            }   
        }
    }
    
    void suma(Matriz m){


    }

    void producto(Matriz m){

    }

    void mostrar(){

    }
}




