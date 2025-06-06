package Metodos;

import java.util.Random;

public class Logica {
    
    //Metodo para asignar los numeros a las cartas
    
   public int []getNumCartas(){  

        int[] numeros = new int[16];
        int count = 0; 

        while(count<16){
            Random r = new Random(); 
            int na = r.nextInt(8)+1;   
            int nvr =0; 

                for (int i = 0; i < 16; i++) {
                    if(numeros[i]==na){
                    nvr++; 
                    }
                }
            if(nvr<2){
            numeros[count]=na;
            count++;
            }
        }
       return numeros; 
    }
}
