/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementarraylist;

/**
 *
 * @author Juanito
 */
public class Pais {
    int id;
    String continente;
    String pais;
    String capital;
    
    public Pais(int id, String co, String pa, String ca){
        this.id = id;
        this.continente = co;
        this.pais = pa;
        this.capital = ca;
    }
    
    public int getId(){
        return id;
    }
    
    public String getPais(){
        return pais;
    }
    
    public String getCapital(){
        return capital;
    }
    
    public String getContinente(){
        return continente;
    }
}
