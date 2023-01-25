import java.io.*;
import java.util.Scanner;

public class FileEditor {
    public static void main(String[] args) throws FileNotFoundException {

        toHwFormat("Tarea.txt", "nuevaTarea.txt");

    }

    //Mensaje a bruno del futuro: lo dejo aqui porque necesito de un split mas flexible.
    //que reciba un array de caracteres por ejemplo
    public static void toHwFormat(String file, String newFile) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream(file));
        PrintStream out = new PrintStream(newFile);
        String[] elements = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] lines = new String[getLinesCount(file)];
        int i = 0;
        do {
            String line = in.nextLine();
            if (contains(elements, line.charAt(0)+"")) {
                lines[i] = "\n\n\n"+line;
            } else {
                lines[i] = line;
            }
            out.println(lines[i]);
            i++;
        } while (in.hasNext());


    }

    public static int getLinesCount(String file) throws FileNotFoundException {
        int len = 0;
        Scanner sc = new Scanner(new FileReader(file));
        while (sc.hasNext()) {
            len++;
            sc.nextLine();
        }
        return len;
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