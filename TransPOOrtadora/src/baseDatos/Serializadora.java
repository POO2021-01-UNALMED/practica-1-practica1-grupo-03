package baseDatos;

import gestorAplicacion.trasnporte.Vehiculo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;


public class Serializadora {
    private static final File rutaTemp = new File("src\\baseDatos\\temp");

    public static void serializar(Vehiculo vehiculo) {
        FileOutputStream fos;
        ObjectOutputStream oos; /* Serializar� */
        File[] docs = rutaTemp.listFiles();
        PrintWriter pw;/* escribir� en el archivo lo que se serializ� */

        assert docs != null;
        for (File archivo : docs) {
            /* Borrar� todo lo que est� en el archivo */
            try {
                pw = new PrintWriter(archivo);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        for (File archivo : docs) {
            if (archivo.getAbsolutePath().contains("vehiculos")) {
                /*
                 * getAbsolutePath() trae la direcci�n del archivo para mirar si correpsonde al
                 * archivo asignaturas
                 */
                try {
                    fos = new FileOutputStream(archivo);
                    oos = new ObjectOutputStream(fos);
                    oos.writeObject(Vehiculo.getVehiculos());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
