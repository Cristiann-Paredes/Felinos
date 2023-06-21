public class Puma extends felinos{
    private String alimentacion;
    private String audicion;
    private String apariencia;

    public Puma(String tamaño, String edad, String garras, String bigotes, String color, String alimentacion, String audicion, String apariencia) {
        super(tamaño, edad, garras, bigotes, color);

        this.alimentacion = alimentacion;
        this.audicion = audicion;
        this.apariencia = apariencia;}

    public String getAlimentacion() {return alimentacion;}
    public void setAlimentacion(String alimentacion) {this.alimentacion = alimentacion;}
    public String getAudicion() {return audicion;}
    public void setAudicion(String audicion) {this.audicion = audicion;}
    public String getApariencia() {return apariencia;}
    public void setApariencia(String apariencia) {this.apariencia = apariencia;}

    //metodos
    public void saltar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void observar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void emboscar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
}
