package ues.ids.za20003;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    private ArrayList<Integer> numberCollection;

    public Exercise3() {
        this.numberCollection = new ArrayList<Integer>();
    }

    public void addNumber() {
        int continueAdd = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una coleccion de numeros");
        int number;
        do {
            System.out.print("Ingrese un numero: ");
            number = input.nextInt();
            this.numberCollection.add(number);
            System.out.print("¿Desea ingresar otro numero? 1.Si 2.No: ");
            continueAdd = input.nextInt();
        } while (continueAdd == 1);
        input.close();
    }

    public void calculateSquare() {
        for (Integer num : this.numberCollection) {
            System.out.println("Numero: " + num + " Cuadrado: " + Math.pow(num, 2));
        }
    }
}
