package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private boolean pelaje;
    private int patas;
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos = 0;
    public static int leones = 0;

    public Mamifero() {
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
