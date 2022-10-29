package pruebapractica1.josebendaña;

import java.util.Scanner;

public class PruebaPractica1JoseBendaña {

    public static void main(String[] args) {
        int cont = 0;
        char resp = 's';
        // Aqui agrefo las variables que se van a utilizar para que pueda entrar traqnuilamente al sistema y tambien inicio el contador con un 0 para
        // que a la hora de entrar se agregue uno y siga el ciclo.
        while(resp=='s'){
            cont++;
            Scanner sc = new Scanner (System.in);
            System.out.println("1. Repetir mi nombre");
            System.out.println("2. SubMenu de mensajes");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Ingrese entre las opciones 1,2 o 3: ");
            int opcion = sc.nextInt();
            System.out.println();
            // Aqui no mas entrar al while el contadopr se suma y de paso se le muestra al usuario el menu para que eliga las opciones.
            switch(opcion){
                case 1:
                    Scanner case1 = new Scanner (System.in);
                    System.out.print("Cuantas veces quiere repetir el texto: ");
                    int veces = sc.nextInt();
                    System.out.print("Ingrese su nombre: ");
                    String nombre = case1.nextLine();
                    for (int i=1;i<=veces;i++){
                        System.out.println("¡Hola mi nombre es "+nombre+" y miren mi prueba!");
                        // Este for se utiliza para que repitamos la oracion con el nombre la cantidad de veces que nos indico el usuario
                    }
                    System.out.println();
                    break;
                    
                case 2:
                    char resp2 = 's';
                    Scanner case2 = new Scanner(System.in);
                    int opcion2;
                    do {
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        System.out.println("3. Salir del submenu");
                        System.out.println();
                        System.out.print("Eliga una opcion entre 1,2 o 3 del submenu: ");
                        opcion2 = case2.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.println("Bienvenido a mi programa");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa");
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                resp2='n';
                                // aqui lo que hago es asignarle a la opcion2 el 8 para que se salga del ciclo a la hora de darle al 3
                                break;
                            default:
                                break;
                        }
                    }while(resp2 == 's');
                    break;
                    
                case 3:
                    resp = 'n';
                    System.out.println("Adios, esta fue mi prueba");
                    break;
                    //Aqui lo que hago es que a la respuesta le asigno el caracter 'n' para que se salga del while ya que la condicion del while es que sea 's'.
                    // Y la 's' no va a cambiar a menos de que el usuario le de al 3 lo cual significa salir.
            }
        }
        if (cont == 1){
            System.out.println("Se estuvo dentro del sistema por "+cont+" vez");
        }else{
            System.out.println("Se estuvo dentro del sistema por "+cont+" veces");
        }
        // En esta parte que agrego un if es para que a la hora de que solo se haya entrado una vez al sistema lo diga correctamente y no diga "1 veces" lo cual esta mal
    }
    
}
