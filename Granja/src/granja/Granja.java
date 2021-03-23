/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.ArrayList;

/**
 * Esta clase te permite crear una granja donde administrar todos tus animales y
 * tu granjero
 *
 * @author https://twitch.tv/KuenKaXx
 */
public class Granja {

    private ArrayList<Animal> animales;
    private Granjero granjero;
    private int tamanoGranja;

    public Granja(Granjero granjero) {
        animales = new ArrayList<>();
        this.granjero = granjero;
    }
    
    public boolean aparear(Animal a, Animal b){
        /**
         * Esta clase hará que los animales se puedan aparear y podamos tener más
         * Los animales deben llamarse igual, tener más de 5 años.
         * Lo añade automaticamente a nuestra lista.
         * y comer los 2 lo mismo
         * @param a el primer animal
         * @param b el segundo animal
         * @return si el animal ha sido creado o no
         */
        if (a.getNombreAnimal().equals(b.getNombreAnimal()) 
                && a.getEdad() >= 5
                && b.getEdad() >= 5
                && a.esVegetariano() == b.esVegetariano()) {
            Animal nuevo = new Animal(a.getNombreAnimal(), a.esVegetariano());
            anadirAnimal(nuevo);
            return true;
        }
    return false;
    }

    public boolean alimentarGranjero(String nombreAnimal) {
        /**
         * Con este metodo damos de comer al granjero un animal el animal debe
         * ser de edad mayor a 5.
         *
         * @param nombreAnimal el animal que queremos darle
         * @return si el granjero ha sido alimentado (true) o no (false)
         */
        Animal animal = animalDeNombre(nombreAnimal);
        if (animal != null) {
            if (animal.getEdad() >= 5) {
                granjero.comer(animal);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean anadirAnimal(Animal animal) {
        /**
         * Añadimos un animal a nuestra lista
         */
        if (tamanoGranja < animales.size()) {
            animales.add(animal);
            return true;
        }
        return false;
    }

    private Animal animalDeNombre(String nombre) {
        for (Animal anim : animales) {
            if (nombre.contentEquals(anim.getNombreAnimal())) {
                return anim;
            }
        }
        return null;
    }
}
