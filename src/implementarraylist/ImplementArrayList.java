/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementarraylist;

/**
 *
 * @author Juanito
 */
public class ImplementArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paises p1 = new Paises();
        
        System.out.println("*** METODO 1 ***");
        p1.PaisesCapital();
        
        System.out.println("*** METODO 2 ***");
        p1.PaisesContinente("AMERICA");
        
        System.out.println("*** METODO 3 ***");
        p1.PaisPosicion(78);
    }
    
}
