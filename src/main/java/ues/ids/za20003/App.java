package ues.ids.za20003;

public class App {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: \n");
        Exercise1 exercise1 = new Exercise1(6);
        System.out.println("Nota: " + exercise1.getNote() + ", Validacion: " + exercise1.validateNote());
        System.out.println();

        System.out.println("Ejercicio 2: \n");
        System.out.println("Primera Version: " + Exercise2.convertNumberToWordsV1(11));
        System.out.println("Segunda Version: " + Exercise2.convertNumberToWordsV2(11));
        System.out.println(Exercise2.convertNumberToWordsV1(72));
        System.out.println();

        System.out.println("Ejercicio 3: \n");
        Exercise3 exercise3 = new Exercise3();
        exercise3.addNumber();
        exercise3.calculateSquare();
        System.out.println();

        System.out.println("Ejercicio 4: \n");
        Exercise4.printSquare();
        System.out.println();

        System.out.println("Ejercicio 5: \n");
        Exercise5 exercise5 = new Exercise5();
        int lowerLimit = 1, upperLimit = 100;
        exercise5.addPrimes(lowerLimit, upperLimit);
        System.out.println(
                "Total de Numeros Primos entre: " + lowerLimit + " y " + upperLimit + " : "
                        + exercise5.getCountPrimes());
        System.out.println(
                "Numeros Primos entre " + lowerLimit + " y " + upperLimit + " : ");
        exercise5.printPrimes();
        System.out.println("\n");

        System.out.println("Ejercicio 6: \n");
        System.out.println("Suma de los primeros 10 multiplos de 5: " + Exercise6.calculateSum(10));
    }
}
