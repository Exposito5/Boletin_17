package boletin_17_1;

import java.util.Random;

public class Numeros {

    int[] numeros = new int[6];

    Random rnd = new Random();

    
    public void cargarArray() {
        for (int i = 0; i < numeros.length; i++) {
        int n = (int) (Math.random () * (50) + 1);
            numeros[i] = n;
        
        }
    }

    public void visualizaArrray() {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
