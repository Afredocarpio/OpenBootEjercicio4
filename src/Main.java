public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Alfredo");
        cliente.setEdad(30);
        cliente.setTelefono(4455566);
        cliente.setCredito(255.555);

        System.out.println("Cliente");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getCredito());
        System.out.println("Credito: " + cliente.getTelefono());
        System.out.println("\n");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Xavier");
        trabajador.setEdad(28);
        trabajador.setTelefono(5222252);
        trabajador.setSalario(25.5855);

        System.out.println("Trabajador");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());

    }
}
class Persona {
    String nombre;
    int edad;
    int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}
class Cliente extends Persona{
    double credito;

    public void setCredito(double credito){
        this.credito = credito;
    }
    public double getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}