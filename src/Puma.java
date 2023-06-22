public class Puma extends felinos{
    private String alimentacion;
    private String audicion;
    private String apariencia;

    public Puma(int tamanio, int edad, String garras, String alimentacion, String audicion, String apariencia) {
        super(tamanio, edad, garras);
        this.alimentacion = alimentacion;
        this.audicion = audicion;
        this.apariencia = apariencia;
    }

    public String getAlimentacion() {return alimentacion;}
    public void setAlimentacion(String alimentacion) {this.alimentacion = alimentacion;}
    public String getAudicion() {return audicion;}
    public void setAudicion(String audicion) {this.audicion = audicion;}
    public String getApariencia() {return apariencia;}
    public void setApariencia(String apariencia) {this.apariencia = apariencia;}

    //metodos
    public void saltar(){
        System.out.println("Puma se salta una altura de alrededor de 2 metros.");}
    public void observar(){
        System.out.println("Puma observa sus presas el largas distancias.");}
    public void emboscar(){
        System.out.println("Puma puede emboscar a unos 60km/h.");}

    public void imprimirPuma(){

        System.out.print("\nEl Puma tiene una alimendasion de  "+ getAlimentacion());
        System.out.print("\nEl Puma tiene una audicion " +getAudicion());
        System.out.print("\nEl Puma tiene un aspecto "+ getApariencia());
        System.out.print("\nPuede realizar las acciones: \n" ) ;
        saltar();
        observar();
        emboscar();
    }


}
