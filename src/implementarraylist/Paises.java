/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementarraylist;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juanito
 */
public class Paises {
    ArrayList<Pais> paises = new ArrayList<>();
    int c = 0;
    
    Paises() {
        try {
            File archivo = new File("paises_capitales.csv");
            Scanner lectura = new Scanner(archivo);
            while(lectura.hasNextLine()){
                String datos = lectura.nextLine();
                String[] parts = datos.split(",");
                String continente = parts[0];
                String pais = parts[1];
                String capital = parts[2];
                paises.add(new Pais(c, continente, pais, capital));
                c++;
            }
            lectura.close();
        } catch (Exception e) {
            System.out.println("OCURRIO UN ERROR.");
            e.printStackTrace();
        }
    }
    
    public void PaisesCapital() {
        for (Pais p : paises) {
            System.out.println(p.getPais() + " " + p.getCapital());
        }
    }
    
    public void PaisesContinente(String con) {
        for (Pais p : paises) {
            if (p.getContinente().equals(con)) {
                System.out.println(p.getPais());
            }
        }
    }
    
    public void PaisPosicion(int pos){
        for (Pais p : paises){
            if(p.getId() == pos) {
                System.out.println(p.getPais());
            }
        }
    }
}
