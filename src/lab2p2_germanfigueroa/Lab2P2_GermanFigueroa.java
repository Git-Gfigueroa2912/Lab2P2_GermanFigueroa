/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_germanfigueroa;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author gafm2
 */
public class Lab2P2_GermanFigueroa {
    public static Scanner entrada = new Scanner(System.in);
    public static Random random = new Random();
    public static ArrayList<Carro> listarCarrosAIngresar = new ArrayList();
    
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del estacionamiento: ");
        int tamaño = entrada.nextInt();
        while(tamaño<=3){
        System.out.println("El tamaño es invalido");
        }
        Carro [][] estacionamiento = new Carro[tamaño][tamaño];
        int randomCarro = random.nextInt(5, 15 + 1);
            for(int i = 0; i < randomCarro; i++){
                CrearCarrosRandom(estacionamiento);
                }
                Matriz(estacionamiento);
                
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
                    
                    
                   
                case 2:    
                    
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
                if(x[i][j] != null){
                    System.out.println("[" + x[i][j].representacion() + "] ");
                }else{
                    System.out.println("");
                }
            }
        }
    }
    public static void CrearCarrosRandom(Carro[][] estacionamiento){
        String[] tipo = {" Sedan ", " Pickup ", " SUV ", " Ford ", " Turismo "};
        String[] color = {" Rojo ", " Amarillo ", " Blanco "};
        double sueldo = random.nextDouble(35);
        boolean pagado = random.nextBoolean();
        int tipoRandom = random.nextInt();
        
    }
    public static void CreaciondeCarros(){
        System.out.println("Ingrese el tipo de carro: ");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese el color del carro: ");
        String color = entrada.nextLine();
        System.out.println("Ingrese el saldo del carro: ");
        double saldo = entrada.nextDouble();
        int id = random.nextInt(25, 103, 140);
        int x = -1;
        int y = -1;
    }
    public static void ingresarCarro(Carro[][] estacionamiento){
        boolean lleno = false;
        for(int i = 0; i < estacionamiento.length; i++){
            for (int j = 0; j < estacionamiento.length; j++){
                if(estacionamiento [i][j] == null){
                    lleno = false;
                    break;
                }
            }
        }
        if(lleno){
            System.out.println("El estacionamiento esta lleno");
        }else{
            mostrarCarro();
            System.out.println("Ingrese el ID del carro: ");
            int id = entrada.nextInt();
            for(int i = 0; i < )
        }
    }
    public static void mostrarCarro(){
        System.out.println("==========MUESTRA DE CARROS=============");
        
    }
    public static void retirarCarro(Carro[][] estacionamiento){
        System.out.println("Ingrese la fila del carro a retirar: ");
        int x = entrada.nextInt();
        System.out.println("Ingrese la columna del carro a retirar: ");
        int y = entrada.nextInt();
        if(x < estacionamiento.length ||  x > -1 || y < estacionamiento.length || y > -1){
            System.out.println("El espacio del carro no se encuentra en el estacionamiento");
        }
        else if(estacionamiento[x][y] == null){
            System.out.println("No se encuentra el carro en el espacio");
        }else{
            Carro temporal = estacionamiento[x][y];
            if(temporal.isPagado()){
                estacionamiento[x][y] = null;
                temporal.retirarCarro();
                System.out.println("El carro ha sido retirado");
            }else{
                System.out.println("Ya no tiene saldo para pagar");
            }
        }
    }
    public static void CarrosNoIngresados(){
        System.out.println("=============CARROS NO INGRESADOS===========");
        
    }
}
