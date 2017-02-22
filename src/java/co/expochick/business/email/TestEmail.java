/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.expochick.business.email;

/**
 *
 * @author Mariana
 */
public class TestEmail {
    public static void main(String[] args){
        Email e = new Email ("Prueba Envio", "Brayan no pudo hacer lo que yo hice...EN TU CARA BABY", "ma412@misena.edu.co");
        e.enviarEmail();
        
    }
}
