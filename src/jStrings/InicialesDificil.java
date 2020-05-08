package jStrings;

import libs.Input;

public class InicialesDificil {
    public static void main(String[] args) {
        System.out.println("Nombre completo: ");
        String nombre = Input.get_string();
        String nombreCortado = nombre.trim();
        String[] nombresInd = nombreCortado.split(" ");

        for (int i = 0; i < nombresInd.length; i++) {
            String nombreAct = nombresInd[i];
            if (nombreAct.length() > 0) {
                char inicial = nombreAct.charAt(0);
                char inicialMay = Character.toUpperCase(inicial);
                System.out.print(inicialMay);
            }
        }
        System.out.println();
    }
}
