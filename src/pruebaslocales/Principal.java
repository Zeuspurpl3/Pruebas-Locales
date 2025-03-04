/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaslocales;

/**
 *
 * @author PC
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Estamos haciendo una prueba, aprendiendo Git");
        ComoQuieras.pintarMensaje("OtroMensaje");
        Rama1 miRama= new Rama1();
       miRama.escribirMensaje("Practicnado con la primera rama");
       Rama2 miRama2=new Rama2();
       miRama2.escribirMensaje("Hola");
       ComoQuierasSecuela c1=new ComoQuierasSecuela();
       c1.escribirMensaje("Mensaje de como quieras secuela");
       //Comentario para commit
    }
    
}
