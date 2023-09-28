package View;

import java.util.Scanner;

public class Console {
    private Scanner leer;

    public Console() {
        leer = new Scanner(System.in);
    }

    public int readInt(String msg) {
        System.out.println(msg);
        int dato = leer.nextInt();
        leer.nextLine();
        return dato;
    }

    public String readString(String msg) {
        System.out.println(msg);
        String dato = leer.nextLine();
        return dato;
    }

    public void showInfo(String msg) {
        System.out.println(msg);
    }
}
