package gestorAplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ruta {
    private int codMunicipio;
    private String destino;
    private double distancia;
    public static ArrayList<Ruta> rutas = new ArrayList<>();

    public Ruta(int codMunicipio, String destino, double distancia) {
        this.codMunicipio=codMunicipio;
        this.destino = destino;
        this.distancia = distancia;
        rutas.add(this);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    public int getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(int codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "codMunicipio=" + codMunicipio +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia + "Km " +
                '}';
    }

    public static void opcionAgregarRuta() {
        Scanner in=new Scanner(System.in);
        System.out.println(" Ingrese el codigo del municipio.");
        int codMunicipio=in.nextInt();
        System.out.println(" Ingrese el destino de la ruta.");
        String destino= in.next();
        System.out.println(" Ingrese la distancia de la ruta.");
        double distancia= in.nextDouble();

        agregarRuta(codMunicipio,destino,distancia);
        System.out.println(" Registro Exitoso");

    }

    public static void elimRuta() {
        Scanner in=new Scanner(System.in);
        System.out.println(" Ingrese el codigo del municipio de la ruta que desea eliminar");
        int codigo= in.nextInt();
        for (Ruta ruta : rutas) {
            if(ruta.getCodMunicipio()==codigo){
                rutas.remove(ruta);
                System.out.println("Ruta eliminada con exito");
                break;
            }
        }
    }

    public static void verRutas() {
        if(rutas.size()==0){
            System.out.println("no hay ninguna ruta");
        }
        for (Ruta ruta : rutas) {
            System.out.println(ruta);
        }
    }

    public static void agregarRuta(int codMunicipio, String destino, double distancia) {
        Ruta ruta=new Ruta(codMunicipio,destino,distancia);
    }

    public static void listaRutas() {
        agregarRuta(5266,"Envigado",	5);
        agregarRuta(5101,"Ciudad Bolivar",	96.80);
        agregarRuta(5045,"Apartado",	303.83);
        agregarRuta(5088,"Bello",	2);
        agregarRuta(5615,"Rionegro",	40.10);
        agregarRuta(5360,"Itagui",	5);
        agregarRuta(5154,"Caucasia",	275.14);
        agregarRuta(5631,"Sabaneta",	7.50);
        agregarRuta(5129,"Caldas",	16.20);
        agregarRuta(5079,"Barbosa",	33.50);
        agregarRuta(5308,"Girardota",	17.80);
        agregarRuta(5306,"Giraldo",	90.90);
        agregarRuta(5368,"Jerico",	105.14);
        agregarRuta(5212,"Copacabana",	10.60);
        agregarRuta(5321,"Guatape",	70.90);

    }



}
