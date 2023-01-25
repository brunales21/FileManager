import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        toHwFormat("Tarea.txt", "nuevaTarea.txt");

    }
/*
    public static String[] split(String s, String[] elements) {
        String[] elements2 = new String[elements.length];
        String s2 = "";
        for (int i = 0; i < elements.length; i++) {


            for (int j = 0; j < s.length(); j++) {
                s2+=s.charAt(j);

                if (elements[i++].equals(s.charAt(j))) {

                }
            }
        }
        return elements2;
    }

 */

    //Mensaje a bruno del futuro: lo dejo aqui porque necesito de un split mas flexible.
    //que reciba un array de caracteres por ejemplo
    public static void toHwFormat(String file, String newFile) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream(file));
        PrintStream out = new PrintStream(newFile);

        String[] elements = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String[] f = new String[50];
        int i = 0;
        do {
            String line = in.nextLine();
            if (contains(elements, line.charAt(0)+"")) {
                f[i] = "\n\n"+line;
            } else {
                f[i] = line;
            }
            out.println(f[i]);
            i++;

        } while (in.hasNext());

    }

    public static boolean contains(String[] array, String s) {
        for (String a: array) {
            if (a.equals(s)) {
                return true;
            }
        }
        return false;
    }

/*
    public static String[] split(String s, String[] elements) {
        String[] elements2 = new String[elements.length];
        String s2 = "";
        for (int i = 0; i < elements.length; i++) {


            for (int j = 0; j < s.length(); j++) {
                s2+=s.charAt(j);

                if (elements[i++].equals(s.charAt(j))) {

                }
            }
        }
        return elements2;
    }

 */
}