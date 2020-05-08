package jStrings;

import libs.Input;

public class InicialesFacil {
    public static void main(String[] args) {
        System.out.println("Escribe un nombre completo: ");
        String nombre = Input.get_string();
        String iniciales = "";
        for (int i = 0; i < nombre.length(); i++) {
            char actual = nombre.charAt(i);
            if (nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z') {
                iniciales = iniciales + nombre.charAt(i);
            }
           }
        System.out.println("Tus iniciales son: " + iniciales);
    }
}