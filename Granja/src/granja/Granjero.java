/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Esta clase te permite crear y administrar al granjero que administra la Granja.
 * @author Diurno
 */
public class Granjero {
    String nombre;
    int vida;
    public Granjero(String nombre){
        /**
         * Con este metodo instanciamos a nuestro granjero, le daremos un nombre 
         * y se le asignará una vida.
         * @param nombre el nombre del granjero.
         * @return el granjero.
         */
        this.nombre = nombre;
        this.vida = 100;
    }
    
    public void despertar(){
        /**
         * Este metodo se encarga de restar una cantidad de vida aleatoria al despertar a tu granjero.
         */
        quitarVida(ThreadLocalRandom.current().nextInt(5, 10 + 1));
    }
    
    public void comer(Animal animal){
        /**
         * Este metodo se encarga de dar de comer a tu granjero para regenerar vida
         * @param animal el animal que va a comer.
         */
        sumarVida(ThreadLocalRandom.current().nextInt(6,9+1));
    }
    
    public int getVida(){
        /**
         * @return devuelve la cantidad de vida de nuestro granjero.
         */
        return vida;
    }
    
    private void quitarVida(int num){
        /**
         * Quitamos vida a nuestro granjero vigilando que no se quede en negativo.
         * @param num La cantidad de vida a restar.
         */
        if ((vida -= num) <= 0)
            vida = 0;
        else
            vida -= num;
    } 
    
    private void sumarVida(int num){
        if ((vida += num) >= 100)
            vida = 100;
        else
            vida += num;
    } 
}
