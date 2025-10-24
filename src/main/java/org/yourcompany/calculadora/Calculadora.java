
package org.yourcompany.calculadora;

public class Calculadora {

    public static void main(String[] args) {
       System.out.println("Preu base: " + preuCinema(5,true,true));
       System.out.println("Preu base: " + preuCinema(10,false,true));
       System.out.println("Preu base: " + preuCinema(10,true,false));
    }
       public static double preuCinema (double preuBase,boolean capSetmana, boolean carnetJove) {
        double preuTotal = 0;

        if (capSetmana == true){
        preuTotal = preuBase + (preuBase * 0.1);
        }
        else if (carnetJove == true){
            preuTotal = preuBase - (preuBase * 0.15);
        }
        else {
            preuTotal = preuBase;
        }
        return preuTotal;
        } 
   }