package main;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int arreglo[], nElementos, aux;

        System.out.println("Digite el numero de elementos");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Metodo burbuja inicia
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        //Metodo burbuja finaliza
        
        //mostrar en forma del menor al mayor
        System.out.print("Arreglo ordenado de menor a mayor ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");

        //mostrar en forma del mayor al menor
        System.out.print("Arreglo ordenado de menor a mayor ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");

    }

}
