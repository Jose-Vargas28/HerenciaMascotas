//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // clase 1
        Perro perro1 = new Perro();
        perro1.caracteristicas();

        //clase 2
        Gato gato1 = new Gato("Vinicio","Birmano",2);
        gato1.caracteristicas();
        gato1.mostrarEdad();
        gato1.datoGato();

        //clase 3
        Tortuga tortuga1 = new Tortuga(1,30);
        tortuga1.datoTortuga();
        tortuga1.accionTortuga();

        //clase4

        Hamster hamster1 = new Hamster("Juarez", "Sirio" ,1, "Blanco");
        hamster1.caracteristicas();
        hamster1.datoHamster();

        //clase 5
        Conejo conejo1 = new Conejo();
        conejo1.setNombre("Tobbi");
        conejo1.imprimir();

    }
}