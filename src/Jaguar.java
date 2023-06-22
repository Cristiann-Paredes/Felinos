public class Jaguar extends felinos {

    private String longitud;
    private String cabeza;
    private String dientes;

    public Jaguar(int tamanio, int edad, String garras, String longitud, String cabeza, String dientes) {
        super(tamanio, edad, garras);
        this.longitud = longitud;
        this.cabeza = cabeza;
        this.dientes = dientes;
    }

    public String getLongitud() {return longitud;}
    public void setLongitud(String longitud) {this.longitud = longitud;}
    public String getCabeza() {return cabeza;}
    public void setCabeza(String cabeza) {this.cabeza = cabeza;}
    public String getDientes() {return dientes;}
    public void setDientes(String dientes) {this.dientes = dientes;}

    //metodos
    public void nadar(){
        System.out.println("Los jaguares tienen gran habilidad de nado.");}
    public void merodear(){
        System.out.println("Los jaguares tienen gran capacidad de moverse en sigilo.");}
    public void explorar(){
        System.out.println("Los jaguares tienen alta capacidad en explorar zonas");}

    public void imprimirJaguar(){

        System.out.print("El Jaguar tiene una longitud de  "+ getLongitud());
        System.out.print("\nEl Jaguar tiene una cabeza de forma " +getCabeza());
        System.out.print("\nEl Jaguar tiene sus dientes "+ getDientes());
        System.out.print("\nPuede realizar las acciones: \n" ) ;
        nadar();
        merodear();
        explorar();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("       ");
    }
}
