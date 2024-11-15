public class Hamster extends Mascota{
    String color;



    public Hamster(String nombre, String raza, int edad, String color) {
        super(nombre, raza, edad);
        this.color = color;
    }

    public Hamster(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    public Hamster(String color) {
        this.color = color;
    }

    public void datoHamster(){
        System.out.println("El color es: " + color);
    }

    public void accionHamster(){
        System.out.println("El hamster es tímido");
    }
}
