package baseDatos;

import gestorAplicacion.CentroDespacho;

import java.io.*;

public class Serializadora {
    /*private static File rutaTemp = new File("src\\baseDatos\\temp");

    public static void serializacion(CentroDespacho centro) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        File[] docs = rutaTemp.listFiles();
        PrintWriter pw;

        for (File archivo : docs) {
            try {
                pw = new PrintWriter(archivo);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        for (File archivo : docs) {
            if (archivo.getAbsolutePath().contains("vehiculos")) {
                /*getAbsolutePath() trae la direcci�n del archivo para mirar si correpsonde al
                 * archivo asignaturas

                try {
                    fos = new FileOutputStream(archivo);
                    oos = new ObjectOutputStream(fos);
                    oos.writeObject(CentroDespacho.getVehiculos());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
}