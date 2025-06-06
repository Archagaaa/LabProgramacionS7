package Metodos;

import java.util.Random;

public class Logica {

    public int[] getNumCartas() {
        int[] cartas = new int[16];
        int[] pares = {1, 2, 3, 4, 5, 6, 7, 8}; 

        for (int i = 0; i < 8; i++) {
            cartas[i] = pares[i];
            cartas[i + 8] = pares[i];
        }

        
        Random rand = new Random();
        for (int i = 0; i < cartas.length; i++) {
            int j = rand.nextInt(cartas.length);
            int temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }

        return cartas;
    }
}

