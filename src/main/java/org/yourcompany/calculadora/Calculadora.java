package org.yourcompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public void mostrarMenuConsola() {
        System.out.println("Menú de SuperCalculadora:");
        System.out.println("1- Suma dels primers n números");
        System.out.println("2- Factorial d'un nombre");
        System.out.println("3- Suma dels quadrats dels primers n números");
        System.out.println("4- Potència d'un nombre");
        System.out.println("5- Nombre de dígits d'un nombre");
        System.out.println("6- Sortir");
    }
    /**
     * Fa una suma dels numeros del 0 fins als que posis
     * @param sumaPrimersNumeros suma del numero fins el que vols arribar
     * @return la suma total dels numeros
     */
    public static double SuperCalculadora(double sumaPrimersNumeros) {
        double suma = 0;
        double i = 0;
        while (i <= sumaPrimersNumeros) {
            suma += 1 * i;
            i++;
        }
        return suma;
    }

    /**
     * Retorna el factorial de calcularFactorial
     * @param calcularFactorial calcula el numero amb el que s'opera i se li calcula el factorial
     * @return torna el total de facotirals d'un número (la sequencia de multiplicacions)
     */
    public static double SuperCaluladora(double calcularFactorial) {
        double multi = 0;
        double i = 0;
        double numInici = calcularFactorial;
        while (i <= calcularFactorial) {
            double factorial = numInici * (calcularFactorial - i);
            System.out.println(numInici + " * " + (calcularFactorial - i) + " = " + factorial);
            i++;
        }
        return calcularFactorial;
    }

    /**
     * Calcula el cuadrat dels numeros que tu li diguis
     * @param sumaQuadrats es el número amb el que opera els cuadrats
     * @return retorna el resultat dels cuadrats calculats
     */
    public static double SuperCalculadoraQuadrats(double sumaQuadrats) {
        double suma = 0;
        int i = 1;
        while (i <= sumaQuadrats) {
            double quadrat = i * i; //elevamos al cuadrado
            suma += quadrat;
            System.out.println(i + "² = " + quadrat + ", suma parcial: " + suma);
            i++;
        }
        return suma;
    }

    /**
     * Retorna el resultat de la base elevada a l'exponent
     * @param base es la base del numero que se li calculará la potencia
     * @param exponent es el exponent que se li aplicará a la base
     * @return retorna el total de la potencia calculada
     */
    public static double calcularPotencia(int base, int exponent) {
        if (exponent == 0) return 1; //cualquier numero elevado a 0 es 1
        
        double resultado = 0;
        for (int i = 0; i < exponent; i++) {
            double sumaParcial = 0;
            //vamos sumando el resultado tantas veces como la base
            if (resultado == 0) {
                resultado = base;
            } else {
                for (int j = 0; j < base; j++) {
                    sumaParcial += resultado;
                }
                resultado = sumaParcial;
            }
        }
        return resultado;
    }

    /**
     * Retorna el nombre de digits que te en total un número
     * @param n Es el número al que li extraurem el nombre de digits amb el que esta compost
     * @return El nombre de digits que te n.
     */
    public static int nombreDigits(int n) {
        if (n == 0) return 1; //el 0 tiene 1 digito
        int count = 0;
        int numero = Math.abs(n); //por si es negativo lo pasamos a positivo
        while (numero > 0) {
            numero /= 10; //vamos quitando digitos
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            calc.mostrarMenuConsola();

            System.out.print("Tria una opció: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introdueix n per sumar els primers n números: ");
                    int n1 = sc.nextInt();
                    double resultado = SuperCalculadora(n1);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    System.out.print("Introdueix un nombre per calcular el factorial: ");
                    int n2 = sc.nextInt();
                    double finals = SuperCaluladora(n2);
                    System.out.println("Resultat: " + finals);
                    break;
                case 3:
                    System.out.print("Introdueix n per sumar els quadrats dels primers n números: ");
                    int n3 = sc.nextInt();
                    double quadrats = SuperCalculadoraQuadrats(n3);
                    System.out.println("Resultat: " + quadrats);
                    break;
                case 4:
                    System.out.print("Introdueix la base: ");
                    int base = sc.nextInt();
                    System.out.print("Introdueix l'exponent: ");
                    int exponent = sc.nextInt();
                    double potencia = calcularPotencia(base, exponent);
                    System.out.println(base + " elevat a " + exponent + " és: " + potencia);
                    break;
                case 5:
                    System.out.print("Introdueix un nombre per calcular el nombre de dígits: ");
                    int nombre = sc.nextInt();
                    int digits = nombreDigits(nombre);
                    System.out.println("El nombre " + nombre + " té " + digits + " dígits.");
                    break;
                case 6:
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a intentar-ho.");
            }
            System.out.println();
        } while (opcion != 6);

        sc.close();
    }
}
