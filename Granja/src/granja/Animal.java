/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.concurrent.ThreadLocalRandom;

/**
* @author https://twitch.tv/KuenKaXx
* Esta clase animal te genera un animal para poder añadir a tu granja,
* el animal puede ser carnivoro o herbívoro teniendo consecuencias
*/
public class Animal {
    private String nombreAnimal;
    private boolean vegetariano;
    private int vida;
    private int edad;
    
    public Animal(String nombre, boolean vegetariano){
        /**
         * @param nombre el nombre del tipo de animal que vas a crear
         * @param vegetariano si quieres que tu animal sea vegetariano (true) o carniviro (false)
         * @return devuelve tu animal
         */
        this.nombreAnimal = nombre;
        this.vegetariano = vegetariano;
        this.vida = 100;
        this.edad = ThreadLocalRandom.current().nextInt(4, 10 + 1);
    }
    
    public void alimentar(Alimento alimento){
        /**
         * @param alimento debes pasarle el alimento que va a consumir el animal, 
         * en el caso de comer algo que no puede comer 
         * (ej: un carnivoro como algo vegetal) recibirá daño, en caso contrario, regenerará vida.
         * @return no devuelve nada, simplemente modifica su vida.
        */
        if (vegetariano && alimento.esCarne()) {
            quitarVida(5);
        }
        if (vegetariano && !alimento.esCarne()) {
            vida += 10;
        }
    }
    
    private void quitarVida(int num){
        if ((vida -= num) <= 0) {
            vida =0;
        }
        else{
            vida -= num;
        }
    }
    
    private void sumarVida(int num){
        if ((vida += num) >= 100) {
            vida =100;
        }
        else{
            vida += num;
        }
    }
    
    public boolean sumarEdad(){
        /**
         * Este metodo permite sumar la edad de tu animal
         * solo en el caso de que su vida sea mayor de 60
         */
        if (vida >= 60) {
            edad++;
            quitarVida(10);
            return true;
        }
        return false;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }
    
    public int getEdad(){
        /**
         * @return devuelve la edad del animal
         */
        return edad;
    }
    
    public boolean esVegetariano (){
        /**
         * @return Devuelve si es vegetariano o no
         */
        return vegetariano;
    }
}
