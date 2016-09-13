/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_8;

/**
 *
 * @author Daniel Salinas
 */
public class Actividad_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        linealListClass list = new linealListClass();
        list.insertFirst("perro");
        list.insertFirst(10);
        list.DeleteFirst();
        list.insertFirst("elefante");
        list.insertLast(50);
        list.insertLast(90);
        list.DeleteLast();
        list.insertLast(500);
        list.showList();
        
    }
    
}
