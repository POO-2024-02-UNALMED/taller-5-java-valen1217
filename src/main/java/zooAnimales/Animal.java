package zooAnimales;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static int totalAnimales = 0;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static String totalPorTipo() {
        return String.format("Mamiferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d",
                Mamifero.getListado().size(), Ave.getListado().size(),
                Reptil.getListado().size(), Pez.getListado().size(),
                Anfibio.getListado().size());
    }

    public String movimiento() {
        return "desplazarse";
    }

    @Override
    public String toString() {
        return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
                nombre, edad, habitat, genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
