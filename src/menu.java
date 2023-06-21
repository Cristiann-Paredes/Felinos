import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {
        public static void main(String[] args) {
            ArrayList<felinos>integrantes=new ArrayList<>();

            Scanner scanner = new Scanner(System.in);
            Leon leon= new Leon(3,45,"redondas","Frondoso",5,"En selvas ");
            integrantes.add(leon);

            System.out.println("Ingrese el tamaño del león: ");
            int  tamanio=scanner.nextInt();
            leon.settamanio(tamanio);

            System.out.println("Ingrese la edad del león: ");
            int Edad =scanner.nextInt();
            leon.setEdad(Edad);

            System.out.println("Ingrese la forma de las patas (redondas, largas, deformes: )");
            String Garras= scanner.next();
            leon.setGarras(Garras);

            System.out.println("Ingrese el pelaje del león )");
            String Pelaje=scanner.next();
            leon.setPelaje(Pelaje);

            System.out.println("Ingrese el numero leones en la manada: ");
            int Manada =scanner.nextInt();
            leon.setManada(Manada);

            System.out.println("Ingrese el lugar como dode el leon se camufra(selva,sabana,paramo ): )");
            String Camuflaje=scanner.next();
            leon.setCamuflaje(Camuflaje);

            System.out.println("El leon mide "+ leon.gettamanio());
            System.out.println("Tiene una edad de "+ leon.getEdad());
            System.out.println("El leon tiene las patas "+ leon.getGarras());
            System.out.println("El leon tiene pelaje "+ leon.getPelaje());
            System.out.println("El leon tiene una manada de  "+ leon.getManada()+ " integrantes");
            System.out.println("El leon se camufla en "+ leon.getCamuflaje());



























        }



}
