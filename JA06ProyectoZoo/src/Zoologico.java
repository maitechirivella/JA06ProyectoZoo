/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author olivia
 */
public class Zoologico {
    Vector v;
    
    Zoologico(){
        this.v=new Vector();
    }
    public void imprimirZoologico(){
        for (int i = 0; i < this.v.size(); i++) {
            ((Animal) this.v.get(i)).imprimirAnimal();
        }
    }
    public void añadeAnimal(String nombre, String paisOrigen, double peso, int edad){
        this.v.addElement(new Animal(nombre,paisOrigen,peso,edad));
    }
    public boolean existeAnimaldelPais(String p){
        Animal a1=new Animal();
        for (int i = 0; i < this.v.size(); i++) {
            a1=(Animal)this.v.get(i);
            if(a1.getPaisOrigen().equals(p))
                return true;
        }
        return false;
    }
    public double edadPromedio(){
        double edades=0,edad;
        double ep;
        Animal a1=new Animal();
        for (int i = 0; i < this.v.size(); i++) {
            a1=(Animal)this.v.get(i);
            edad=(a1.getEdad());
            edades+=edad;
        }
        ep=edades/(this.v.size());
        return ep;
    }
    public void eliminaAnimalde(String p){
        Animal a1=new Animal();
        for (int i = 0; i < this.v.size(); i++) {
            a1=(Animal)this.v.get(i);
            if(a1.getPaisOrigen().equals(p))
               this.v.remove(i);
        }
        
    } 
    public int cuantosPesanMas(double pes){
        Animal a1=new Animal();
        int animales=0;
        for (int i = 0; i < this.v.size(); i++) {
            a1=(Animal)this.v.get(i);
            if(a1.getPeso()>pes)
               animales++;
        }
        return animales;
        
    } 
    public boolean siEsta(Animal a){
        Animal a1=new Animal();
        for (int i = 0; i < this.v.size(); i++) {
            a1=(Animal)this.v.get(i);
            if(a1.esIgual(a)){
                return true;
            }
        }
        return false;
    }
    public int edadDelPrimero(){
        Animal a1=new Animal();
        a1=(Animal)this.v.firstElement();
        return a1.getEdad();
    }
    public double pesoDelUltimo(){
        Animal a1=new Animal();
        a1=(Animal)this.v.lastElement();
        return a1.getPeso();
    }
    public void reemplazaAnimal(Animal a,int pos){
        String nombre=a.nombre;
        String paisOrigen=a.paisOrigen;
        double peso=a.peso;
        int edad=a.edad;
        this.v.set(pos, (new Animal(nombre,paisOrigen,peso,edad)));
    }
    public void eliminaAnimal(int pos){
        this.v.remove(pos);
    }
    public void insertaAnimal(Animal a,int pos){
        String nombre=a.nombre;
        String paisOrigen=a.paisOrigen;
        double peso=a.peso;
        int edad=a.edad;
        this.v.add(pos, (new Animal(nombre,paisOrigen,peso,edad)));
    }
    public void clausuraZoologico(){
        this.v.removeAllElements();
    }
    public boolean zoologicoClausurado(){
        if(this.v.isEmpty())
            return true;
        else
            return false;
    }
    
}
