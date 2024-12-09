package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private String colorEscamas;
    private int largoCola;
    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas = 0;
    public static int serpientes = 0;

    public Reptil() {
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static int cantidadReptiles() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }
}
