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







}
