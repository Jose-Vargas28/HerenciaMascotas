//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro();
        perro1.caracteristicas();

        Gato gato1 = new Gato("Vinicio","Birmano",2);
        gato1.caracteristicas();
        gato1.mostrarEdad();

        Tortuga tortuga1 = new Tortuga();
        tortuga1.caracteristicas();


        Conejo conejo1 = new Conejo();
        conejo1.setNombre("Tobbi");
        conejo1.imprimir();

    }
}