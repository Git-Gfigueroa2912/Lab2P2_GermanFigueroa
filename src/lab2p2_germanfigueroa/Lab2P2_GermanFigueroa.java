/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_germanfigueroa;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gafm2
 */
public class Lab2P2_GermanFigueroa {
    public static Scanner entrada = new Scanner(System.in);
    public static Random random = new Random();
    
    public static void main(String[] args) {
        int opcion = 0;
        do{
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("1. Parking ");
            System.out.println("0. Salir ");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                
                case 1:
                    System.out.println("Parking");
                    System.out.println("Ingrese el tamaño del estacionamiento: ");
                    int tamaño = entrada.nextInt();
                    while(tamaño>=3){
                        System.out.println("El tamaño es invalido");
                    }
                    
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
                    break;
                    
            }
        }while(opcion != 0);
    }
    public static int menu(int resp){
        System.out.println("========MENU=======");
        System.out.println("1. Nuevo carro ");
        System.out.println("2. Ingresar carro al estacionamiento");
        System.out.println("3. Sacar carro del estacionamiento");
        System.out.println("4. Ver carros creados sin ingresar");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opcion: ");
        resp = entrada.nextInt();
        
        return resp;
    }
    public static void Matriz(int[][] estacionamiento){
        for(int i = 0; x.length; i++){
            for(int j = 0; y.length; j++){
                
            }
        }
    }
    public static void CrearCarrosRandom(){
        String[] tipo = {" Sedan ", " Pickup ", " SUV "};
        String[] color = {" Rojo ", " Amarillo ", " Blanco "};
        double sueldo = random.nextDouble(35);
        boolean pagado = random.nextBoolean();
        
    }
    public static void CreaciondeCarros(){
        System.out.println("Ingrese el tipo de carro: ");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese el color del carro: ");
        String color = entrada.nextLine();
        System.out.println("Ingrese el saldo del carro: ");
        double saldo = entrada.nextDouble();
        int id = random.nextInt(25, 103, 140);
    }
}
