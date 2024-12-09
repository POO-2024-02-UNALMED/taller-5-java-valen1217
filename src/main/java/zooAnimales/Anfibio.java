package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private String colorPiel;
    private boolean venenoso;
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas = 0;
    public static int salamandras = 0;

    public Anfibio() {
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

   
    public String getColorPiel() {
        return colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
}
