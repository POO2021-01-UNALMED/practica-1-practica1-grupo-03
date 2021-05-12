package baseDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import gestorAplicacion.trasnporte.Vehiculo;

public class Deserializador {
    private static File rutaTemp = new File("src\\basedatos\\temp");
    public static void deserializar(Vehiculo vehiculo) {
        File[] docs = rutaTemp.listFiles();
        FileInputStream fis;
        ObjectInputStream ois;

        assert docs != null;
        for (File archivo : docs) {
            if (archivo.getAbsolutePath().contains("vehiculos")) {
                try {
                    fis = new FileInputStream(archivo);
                    ois = new ObjectInputStream(fis);

                    Vehiculo.setVehiculos((ArrayList<Vehiculo>) ois.readObject());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
