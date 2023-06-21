public class Jaguar extends felinos {

    private String longitud;
    private String cabeza;
    private String dientes;

    public Jaguar(String tamaño, String edad, String garras, String bigotes, String color, String longitud, String cabeza, String dientes) {
        super(tamaño, edad, garras, bigotes, color);

        this.longitud = longitud;
        this.cabeza = cabeza;
        this.dientes = dientes;}

    public String getLongitud() {return longitud;}

    public void setLongitud(String longitud) {this.longitud = longitud;}

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
