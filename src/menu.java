import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {
        public static void main(String[] args) {
            ArrayList<felinos>integrantes=new ArrayList<>();

            Scanner scanner = new Scanner(System.in);
            //esto es solo para ver los atributos que tiene el león
            Leon leon= new Leon(3,45,"redondas","Frondoso",5,"En selvas ");
            integrantes.add(leon);

            System.out.println("Felino 1");
            System.out.println("LEON");
            System.out.println("Ingrese el tamaño del león: ");
            int tamanio=scanner.nextInt();
            leon.settamanio(tamanio);
            System.out.println("Ingrese la edad del león: ");
            int Edad =scanner.nextInt();
            leon.setEdad(Edad);
            System.out.println("Ingrese la forma de las patas (redondas, largas, deformes: )");
            String Garras= scanner.next();
            leon.setGarras(Garras);
            System.out.println("Ingrese el color de pelaje del león (beige, marron, ocre) ");
            String Pelaje=scanner.next();
            leon.setPelaje(Pelaje);
            System.out.println("Ingrese el numero leones en la manada: ");
            int Manada =scanner.nextInt();
            leon.setManada(Manada);
            System.out.println("Ingrese el lugar como dónde el leon se camufla(selva,sabana,páramo ): )");
            String Camuflaje=scanner.next();
            leon.setCamuflaje(Camuflaje);
            System.out.println("-----------------------------------------------------------------");

            //para ver los atributos
            Puma puma=new Puma(5,7,"largas","carnivoro","alta","color negro");
            integrantes.add(puma);

            System.out.println("Felino 2");
            System.out.println("PUMA");
            System.out.println("Ingrese el principal alimento del puma : ");
            String Alimentacion=scanner.next();
            puma.setAlimentacion(Alimentacion);
            System.out.println("Ingrese el tipo de audicion del puma (Alta, media, baja)");
            String audicion=scanner.next();
            puma.setAudicion(audicion);
            System.out.println("Ingrese el aspecto del puma");
            String apariencia=scanner.next();
            puma.setApariencia(apariencia);
            System.out.println("-----------------------------------------------------------------");


            //solopara ver los atributos
            Jaguar jaguar=new Jaguar(1,3,"dos","1.8 m","en punta","afilados");
            integrantes.add(jaguar);

            System.out.println("Felino 3");
            System.out.println("JAGUAR");
            System.out.println("Ingrese el largo que puede llegar a tener un Jaguar: ");
            String Longitud =scanner.nextLine();
            jaguar.setLongitud(Longitud);
            System.out.println("Ingrese la forma del craneo del jaguar (redonda, punteada, achatada)");
            String cabeza=scanner.next();
            jaguar.setCabeza(cabeza);
            System.out.println("Ingrese forma de la boca del jaguar (Incisivos, Caninos,premorales)");
            String dientes=scanner.next();
            jaguar.setDientes(dientes);
            System.out.println("-----------------------------------------------------------------");

            Lince lince=new Lince(1,1,"largas","400m","zona forestal","mamifero");
            integrantes.add(lince);
            System.out.println("Felino 4:");
            System.out.println("LINCE");
            System.out.println("Ingrese vision de un lince: ");
            String vision=scanner.next();
            lince.setVision(vision);
            System.out.println("Ingrese habitat donde vive: ");
            String territorio=scanner.next();
            lince.setTerritorio(territorio);
            System.out.println("Se clasifica como invertebrado de tipo(mamifero,anfibio,etc): ");
            String reproduccion=scanner.next();
            lince.setReproduccion(reproduccion);
            System.out.println("-----------------------------------------------------------------");

            Gato gato=new Gato(1,1,"cortas","Domestico","trepar","maullar");
            integrantes.add(gato);
            System.out.println("Felino 5");
            System.out.println("GATO");
            System.out.println("Ingrese el tipo de adaptación: ");
            String comportamiento=scanner.next();
            gato.setConportamiento(comportamiento);
            System.out.println("Ingrese la habilidad más característica de un gato: ");
            String agilidad=scanner.next();
            gato.setAgilidad(agilidad);
            System.out.println("Que tipo de sonido emite un gato: ");
            String comunicacion=scanner.next();
            gato.setComunicacion(comunicacion);
            System.out.println("-----------------------------------------------------------------");

            //Imprimir León
            System.out.println("El leon ");
            leon.imprimirLeon();
            //imprimir Puma
            System.out.println("El Puma ");
            puma.imprimirPuma();
            //imprimir jaguar
            System.out.println("El Jaguar ");
            jaguar.imprimirJaguar();
            //imprimir Lince
            System.out.println("El Lince ");
            lince.imprimirLince();
            //imprimir Gato
            System.out.println("El Gato ");
            gato.imprimirGato();

        }



}
