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

/**public class nodeClass {
    int data;
    nodeClass next;
    
    public nodeClass(int data){
        this.data=data;
        this.next=null;
    }
}
*/
public class nodeClass <t>{
    t data;
    nodeClass next;
    
    public nodeClass(t data){
        this.data=data;
        this.next=null;
    }
}

