/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author olivia
 */
public class Animal {
    String nombre;
    String paisOrigen;
    double peso;
    int edad;
    Animal(){}
    
    public Animal(String nombre, String paisOrigen, double peso, int edad) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.peso = peso;
        this.edad = edad;
    }
    public void imprimirAnimal(){
        System.out.println(this.nombre+"\t"+this.paisOrigen+"\t"+this.edad+" años \t"+this.peso+" kg");
    }
    
    public boolean esIgual(Animal a){
        if(this.nombre.equals(a.nombre)){
            if(this.paisOrigen.equals(a.paisOrigen)){
                if(this.peso==a.peso){
                    if(this.edad==a.edad)
                        return true;
                    else
                        return false;
                }else
                    return false;
            }else
                return false;
        }else
            return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
