package gNumericTypes;

import libs.Input;

public class BotellasAgua {
    public static void main(String[] args) {
        System.out.println("¿Cuantos minutos tardas bañandote?: ");
        int x = Input.get_int();
            System.out.println("Sabias que si tardas " + x + " minutos estas desperdiciando " + x * 12 + " botellas de agua!!");
        }

    }

