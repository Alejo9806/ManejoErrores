import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            dividirPorCero(5);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            overflowArray(6);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            fileNotExists("hola.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void dividirPorCero(int numero) throws ArithmeticException {
        int resultado = numero / 0;
    }

    public static void overflowArray(int elementos) throws ArrayIndexOutOfBoundsException {
        int[] array = new int[elementos];
        for (int i = 0; i < 9; i++) {
            array[i] = i;
        }
    }

    public static void fileNotExists(String path)  throws FileNotFoundException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("El archivo no existe");
        }
        System.out.println(file.exists());
    }
}