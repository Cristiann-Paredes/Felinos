public class Jaguar extends felinos {

    private int longitud;
    private String cabeza;
    private String dientes;

    public Jaguar(int tamanio, int edad, String garras, int longitud, String cabeza, String dientes) {
        super(tamanio, edad, garras);
        this.longitud = longitud;
        this.cabeza = cabeza;
        this.dientes = dientes;
    }

    public int getLongitud() {return longitud;}
    public void setLongitud(int longitud) {this.longitud = longitud;}
    public String getCabeza() {return cabeza;}
    public void setCabeza(String cabeza) {this.cabeza = cabeza;}
    public String getDientes() {return dientes;}
    public void setDientes(String dientes) {this.dientes = dientes;}

    //metodos
    public void nadar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void merodear(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void explorar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
}
