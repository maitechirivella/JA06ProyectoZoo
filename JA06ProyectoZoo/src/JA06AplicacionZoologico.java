/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author MaiteChirivella
 */
public class JA06AplicacionZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Zoologico zoo1=new Zoologico();
        Animal a1=new Animal();
        String nombre;
        String paisOrigen;
        double peso;
        int edad,tAnimales,posicion;
        int opcion;
        
        do {
            imprimirMenu();
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Inserta Nombre");
                    nombre=teclado.nextLine();
                    System.out.println("Inserta Pais Origen");
                    paisOrigen=teclado.nextLine();
                    System.out.println("Introduce Peso");
                    peso=teclado.nextFloat();
                    System.out.println("Introduce Edad");
                    edad=teclado.nextInt();
                    zoo1.añadeAnimal(nombre, paisOrigen, peso, edad);
                    zoo1.imprimirZoologico();
                    break;
                case 2:
                    System.out.println("Inserta Nombre");
                    nombre=teclado.nextLine();
                    System.out.println("Inserta Pais Origen");
                    paisOrigen=teclado.nextLine();
                    System.out.println("Introduce Peso");
                    peso=teclado.nextFloat();
                    System.out.println("Introduce Edad");
                    edad=teclado.nextInt();
                    System.out.println("Introduce Posicion");
                    posicion=teclado.nextInt();
                    zoo1.insertaAnimal(new Animal(nombre, paisOrigen, peso, edad), posicion);
                    zoo1.imprimirZoologico();
                    break;
                case 3:
                    System.out.println("Inserta pais");
                    paisOrigen=teclado.nextLine();
                    System.out.println("El animal del pais "+paisOrigen+" existe "+zoo1.existeAnimaldelPais(paisOrigen));
                    break;
                case 4:
                    edad=(int) zoo1.edadPromedio();
                    System.out.println("La edad promedio es "+edad);
                    break;
                case 5:
                    System.out.println("Introduce el pais");
                    paisOrigen=teclado.nextLine();
                    zoo1.eliminaAnimalde(paisOrigen);
                    zoo1.imprimirZoologico();
                    break;
                case 6:
                    System.out.println("Introduce peso");
                    peso=teclado.nextDouble();
                    tAnimales=zoo1.cuantosPesanMas(peso);
                    System.out.println("Animales que pesan mas de "+peso+" : "+tAnimales);
                    break;
                case 7:
                    System.out.println("Inserta Nombre");
                    nombre=teclado.nextLine();
                    System.out.println("Inserta Pais Origen");
                    paisOrigen=teclado.nextLine();
                    System.out.println("Introduce Peso");
                    peso=teclado.nextFloat();
                    System.out.println("Introduce Edad");
                    edad=teclado.nextInt();
                    a1=new Animal(nombre, paisOrigen, peso, edad);
                    System.out.println("El animal: "+nombre+" "+paisOrigen+" "+peso+" "+edad+" existe "+zoo1.siEsta(a1));
                    break;
                case 8:
                    System.out.println("Edad del primero "+zoo1.edadDelPrimero());
                    System.out.println("Peso del ultimo "+zoo1.pesoDelUltimo());
                    break;
                case 9:
                    System.out.println("Inserta Nombre");
                    nombre=teclado.nextLine();
                    System.out.println("Inserta Pais Origen");
                    paisOrigen=teclado.nextLine();
                    System.out.println("Introduce Peso");
                    peso=teclado.nextFloat();
                    System.out.println("Introduce Edad");
                    edad=teclado.nextInt();
                    a1=new Animal(nombre, paisOrigen, peso, edad);
                    System.out.println("Introduce posicion");
                    posicion=teclado.nextInt();
                    zoo1.reemplazaAnimal(a1, posicion);
                    zoo1.imprimirZoologico();
                    break;
                case 10:
                    System.out.println("Introduce posicion");
                    posicion=teclado.nextInt();
                    zoo1.eliminaAnimal(posicion);
                    zoo1.imprimirZoologico();
                    break;
                case 11:
                    zoo1.clausuraZoologico();
                    System.out.println("El zoologico esta clausurado "+zoo1.zoologicoClausurado());
                    break;
                case 12:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion!=12);
    }
    public static void imprimirMenu(){
        System.out.println("1. Añade Animal");
        System.out.println("2. Añade Animal en posicion determinada");
        System.out.println("3. Existe Animal de un pais determinado");
        System.out.println("4. Edad Promedio de todos los animales");
        System.out.println("5. Eliminar todos los animales de un Pais determinado");
        System.out.println("6. Cuantos animales pesan mas de un peso determinado");
        System.out.println("7. Existe un animal (todos sus parametros determinados)");
        System.out.println("8. Edad del primer y peso del ultimo animal de la lista");
        System.out.println("9. Reemplaza Animal en posicion determinada");
        System.out.println("10. Elimina Animal posicion determinada");
        System.out.println("11. Clausura zoologico");
        System.out.println("12. Salir");
    }
    
}
