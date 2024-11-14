public class Mascota {
    String nombre;
    String raza;
    int edad;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void caracteristicas() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El raza es: " + raza);
    }

    public void mostrarEdad(){
        System.out.println("El edad es: " + edad);
    }
}
