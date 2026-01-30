/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_germanfigueroa;

/**
 *
 * @author gafm2
 */
public class Carro {
    private String tipo;
    private String color;
    private double saldo;
    private boolean pagado;
    private int x;
    private int y;
    private int id;
    
    Carro(String tipo, String color, double saldo, boolean pagado, int x, int y, int id){
      this.tipo = tipo;
      this.color = color;
      this.saldo = saldo;
      this.pagado = pagado;
      this.x = x;
      this.y = y;
      this.id = id;
      
    }
    public boolean pagado(){
          if(saldo >= 0){
              return true;
        }else{
              return false;
        }
    }
    public String representacion(){
        String representacion = ""+tipo.charAt(0);
        return representacion;
    }
    public void Coordenadas(int fila, int columna){
        this.x = fila;
        this.y = columna;
    }
    public void retirarCarro(){
        this.x = -1;
        this.y = -1;
    }
    public String getTipo(){
        return tipo;
    }
    public String setTipo(){
        return tipo;
    }
    public String getColor(){
        return color;
    }
    public String setColor(){
        return this.color;
    }
    public double getSaldo(){
        return saldo;
    }
    public double setSaldo(){
        return this.saldo;
    }
    public boolean getPagado(){
        return pagado;
    }
    public boolean setPagado(){
        return pagado;
    }
    public int getID(){
        return id;
    }

}
