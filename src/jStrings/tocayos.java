package jStrings;

import libs.Input;

public class tocayos {
    public static void main(String[] args) {

        System.out.println("Ingresa primer nombre completo: ");
        String nombreUno = Input.get_string();

        System.out.println("Ingresa segundo nombre completo: ");
        String nombreDos = Input.get_string();

        String nom[] = (nombreUno.split(" "));
        int contador=0;

        for(int x=0; x <nom.length; x++ ){
            String nombreActual = nom[x];
            if(nombreDos.contains(nombreActual)) {
                contador++;
            }
        }
        if(contador>0){
            System.out.print("Eres Tocayo ");
        }

    }

}


