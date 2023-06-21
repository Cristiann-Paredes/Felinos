public class Gato extends felinos {
    private String conportamiento;
    private String agilidad;
    private String comunicacion;

    public Gato(int tamanio, int edad, String garras, String conportamiento, String agilidad, String comunicacion) {
        super(tamanio, edad, garras);
        this.conportamiento = conportamiento;
        this.agilidad = agilidad;
        this.comunicacion = comunicacion;
    }

    public String getConportamiento() {return conportamiento;}

    public void setConportamiento(String conportamiento) {this.conportamiento = conportamiento;}

    public String getAgilidad() {return agilidad;}

    public void setAgilidad(String agilidad) {this.agilidad = agilidad;}

    public String getComunicacion() {return comunicacion;}

    public void setComunicacion(String comunicacion) {this.comunicacion = comunicacion;}
    //metodos
    public void Trepar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void jugar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void maullar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
}
