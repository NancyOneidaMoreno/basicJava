package jStrings;
import libs.Input;

public class minutosSegundos {
    public static void main(String[] args) {

        String[] datos;
        do {
            System.out.println("Duranción del video: (mm:ss)");
            String duracion = Input.get_string();

            datos = duracion.split(":");
            if(Integer.parseInt(datos[1]) >= 60){
                System.out.println("Los segundos estan mal.  Vuelve a ingresar los datos");
            }

        } while(Integer.parseInt(datos[1]) >= 60);

        int total = (Integer.parseInt(datos[0])*60) + Integer.parseInt(datos[1]);

        System.out.println("\nEl video dura "+ total + " segundos");
    }
}
