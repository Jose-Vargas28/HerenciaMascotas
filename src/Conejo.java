public class Conejo extends Mascota{

    String nombre;

    public Conejo() {
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir(){
        System.out.println("El nombre es: "+nombre);
    }
}
