public class Gato extends Mascota {

    public Gato(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    public void datoGato(){
        System.out.println("El gato fue adoptado");
    }

    public void accionGato(){
        System.out.println("El gato pasa durmiendo");
    }
}
