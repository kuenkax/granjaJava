/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 * Esta clase te permite crear un alimento para alimentar a tus animales
 * @author https://twitch.tv/KuenKaxx
 */
public class Alimento {
    private String nombreAlimento;
    private boolean esCarne;
    
    public Alimento(String nombre, boolean esCarne){
        /**
         * @param nombre le das un nombre al alimento
         * @param esCarne indicas si tu alimento es carne o no, esto repercutirá al alimentar tus animales.
         * @return te devuelve tu alimento
         */
        this.nombreAlimento = nombre;
        this.esCarne = esCarne;
    }
    
    public boolean esCarne(){
        /**
         * @return devuelve su tu alimento es carne (true) o no (false)
         */
        return esCarne;
    }
    
}
