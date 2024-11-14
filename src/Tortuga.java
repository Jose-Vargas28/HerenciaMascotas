public class Tortuga extends Mascota{
    double tamanio;
    double peso;

    public Tortuga(double tamanio, double peso) {
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public Tortuga(String nombre, String raza, int edad, double tamanio, double peso) {
        super(nombre, raza, edad);
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public void datoTortuga(){
        System.out.println("El tamaño de la tortuga en metros es: " + tamanio);
        System.out.println("El peso de la tortuga en kg es: " + peso);
    }

    public void accionTortuga(){
        System.out.println("La tortuga muerde");
    }
}
