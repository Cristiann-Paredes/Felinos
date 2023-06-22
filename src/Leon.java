public class Leon extends felinos {
    private String pelaje;
    private int manada;
    private String camuflaje;
    public Leon(){
        super();
    }
    public Leon(int tamanio, int edad, String garras, String pelaje, int manada, String camuflaje) {
        super(tamanio, edad, garras);

        this.pelaje = pelaje;
        this.manada = manada;
        this.camuflaje = camuflaje;
    }

    public String getPelaje() {return pelaje;}
    public void setPelaje(String pelaje) {this.pelaje = pelaje;}
    public int getManada() {return manada;}
    public void setManada(int manada) {this.manada = manada;}
    public String getCamuflaje() {return camuflaje;}
    public void setCamuflaje(String camuflaje) {this.camuflaje = camuflaje;}

    //metodos
    public void rugir(){
        System.out.println("El rugido del león es uno de los más temidos de la sabana ");}
    public void asechar(){
        System.out.println("Tienen una manera muy particular y sincronizada de asechar a otros animales ");}
    public void proteger(){
        System.out.println("Leones se protegen con su tamaño intimidante, dientes afilados y garras afiladas.");}


        public void imprimirLeon(){
            System.out.print("El leon mide "+ gettamanio());
            System.out.print("\nTiene una edad de "+ getEdad());
            System.out.print("\nEl leon tiene las patas "+ getGarras());
            System.out.print("\nEl leon tiene pelaje "+ getPelaje());
            System.out.print("\nEl leon tiene una manada de  "+ getManada()+ " integrantes");
            System.out.print("\nEl leon se camufla en "+ getCamuflaje());
            System.out.print("\nPuede realizar las acciones: \n" ) ;
            rugir();
            asechar();
            proteger();
            System.out.println("-----------------------------------------------------------------");
            System.out.println("       ");
        }





}
