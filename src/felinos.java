public class felinos {

    private String tamaño;
    private String edad;
    private String garras;
    private  String bigotes;
    private String color;


    public felinos(){
    }

    public felinos(String tamaño, String edad, String garras, String bigotes, String color) {
        this.tamaño = tamaño;
        this.edad = edad;
        this.garras = garras;
        this.bigotes = bigotes;
        this.color = color;
    }

    public String getTamaño() {return tamaño;}
    public void setTamaño(String tamaño) {this.tamaño = tamaño;}
    public String getEdad() {return edad;}
    public void setEdad(String edad) {this.edad = edad;}
    public String getGarras() {return garras;}
    public void setGarras(String garras) {this.garras = garras;}
    public String getBigotes() {return bigotes;}
    public void setBigotes(String bigotes) {this.bigotes = bigotes;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

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
