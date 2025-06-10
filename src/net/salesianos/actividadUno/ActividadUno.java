package net.salesianos.actividadUno;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActividadUno {
    public static void realizarActividad() {
        try {
            // a) Creo el fichero para usar en la actividad
            File archivo = new File("actividad1.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }

            // b) Le pido al tonto que me introduzca un texto de al menos 30 caracteres
            Scanner scanner = new Scanner(System.in);
            String texto;
            do {
                System.out.print("Introduce un texto de al menos 30 caracteres: ");
                texto = scanner.nextLine();
                if (texto.length() < 30) {
                    System.out.println("Faltan " + (30 - texto.length()) + " caracteres.");
                }
            } while (texto.length() < 30);

            // c) Pongo el texto en mayúsculas y cambio los espacios por guiones bajos
            String textoFormateado = texto.toUpperCase().replace(" ", "_");

            // d) Guardar texto en el fichero
            FileWriter escritor = new FileWriter("actividad1.txt");
            escritor.write(textoFormateado);
            escritor.close();
            System.out.println("Texto guardado en el archivo.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
}
  }
    
