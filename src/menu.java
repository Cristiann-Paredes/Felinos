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
            String Garras=scanner.nextLine();
            leon.setGarras(Garras);


























        }



}
