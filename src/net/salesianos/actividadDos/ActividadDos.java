import java.io.FileReader;
import java.io.IOException;
public class ActividadDos {
    public static void realizarActividadDos(){
    try {
            FileReader lector = new FileReader("actividad2.txt");
            int caracter;
            boolean primero = true;

            while ((caracter = lector.read()) != -1) {
                char letra = (char) caracter;
                if (!primero) {
                    System.out.print(", ");
                }
                System.out.print(letra + "_" + caracter);
                primero = false;
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }

}