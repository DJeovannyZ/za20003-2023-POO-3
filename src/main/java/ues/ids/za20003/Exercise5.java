package ues.ids.za20003;

import java.util.ArrayList;

public class Exercise5 {
    private ArrayList<Integer> primesNumbers; 

    public Exercise5(){
        this.primesNumbers = new ArrayList<Integer>();
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int countDiv = 0;

            for (int i = number; i > 0; i--) {
                if (number % i == 0) {
                    countDiv += 1;
                }
            }
            if (countDiv == 2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void addPrimes(int lowerLimit, int upperLimit){
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if(isPrime(i)){
                this.primesNumbers.add(i);
            }
        }
    }

    public int getCountPrimes(){
        return this.primesNumbers.size();
    }

    public void printPrimes(){
        for(Integer prime : this.primesNumbers ){
            System.out.print(prime + " , ");
        }
    }

}
