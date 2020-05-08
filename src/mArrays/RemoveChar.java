package mArrays;

import libs.Input;

public class RemoveChar {
    public static void main(String[] args) {
        System.out.println("Ingresa Cadena: \n");
        String mensaje = Input.get_string();
        System.out.println("Ingresa el caracter a remover: \n");
        String mensajeSin = mensaje.trim();
        char letra = Input.get_char();

        String result = eliminarcaracter(mensajeSin, letra);
    }
        private static String eliminarcaracter(String mensajeSin, char letra) {
        String resultado = "";
        for (int x=0; x < mensajeSin.length(); x++){
            char actual = mensajeSin.charAt(x);
            if (actual != letra)
                resultado = resultado + actual;
        }
        return resultado;
        }
}
