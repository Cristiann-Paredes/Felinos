public class Lince extends felinos {
    private String vision;
    private String territorio;
    private String reproduccion;

    public Lince(int tamanio, int edad, String garras, String vision, String territorio, String reproduccion) {
        super(tamanio, edad, garras);
        this.vision = vision;
        this.territorio = territorio;
        this.reproduccion = reproduccion;
    }

    public String getVision() {return vision;}

    public void setVision(String vision) {this.vision = vision;}

    public String getTerritorio() {return territorio;}

    public void setTerritorio(String territorio) {this.territorio = territorio;}

    public String getReproduccion() {return reproduccion;}

    public void setReproduccion(String reproduccion) {this.reproduccion = reproduccion;}

    public void correr(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void acicalar(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}
    public void imprimirLince(){

        System.out.print("El Lince tiene una vision   "+ getVision());
        System.out.print("\nEl Lince vive en territorio de " +getTerritorio());
        System.out.print("\nEl Lince es un especie de "+ getReproduccion());
        System.out.print("\nPuede realizar las acciones: \n" ) ;
        correr();
        acicalar();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("       ");
    }



}
