public class felinos {

    private int tamanio;
    private int edad;
    private String garras;


    public felinos(){
    }

    public felinos(int tamanio, int edad, String garras) {
        this.tamanio = tamanio;
        this.edad = edad;
        this.garras = garras;
    }

    public int gettamanio() {return tamanio;}
    public void settamanio(int tamanio) {this.tamanio = tamanio;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public String getGarras() {return garras;}
    public void setGarras(String garras) {this.garras = garras;}

    //metodos
    public void Comer(){
        System.out.println("Los felinos se alimentan principalmente de carne");
    }
    public void dormir(){
        System.out.println("Los felinos duermen entre 12 y 16 horas");
    }
    public void trepar(){
        System.out.println("La mayoria de felinos pueden trepar ");
    }


}
