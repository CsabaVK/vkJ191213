/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_austrália;

import java.util.ArrayList;

/**
 *
 * @author csabavk
 */
class auceania{
    private String elnevezes;
    private int terület;
    private int lakossag;

    public auceania(String elnevezes, int terület, int lakossag) {
        this.elnevezes = elnevezes;
        this.terület = terület;
        this.lakossag = lakossag;
    }

    public String getElnevezes() {
        return elnevezes;
    }

    public int getTerület() {
        return terület;
    }

    public int getLakossag() {
        return lakossag;
    }
    
    public double nepsuruseg()
    {
        return ((double)lakossag/terület);
    }
    
    public auceania(String sor)
    {
        String[] d = sor.split(";");
        this.elnevezes = d[0];
        this.terület = Integer.parseInt(d[1]);
        this.lakossag = Integer.parseInt(d[2]); 
    }
    
}
public class Java_Austrália {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<auceania> list = new ArrayList<>();
        
        String[] d = short.Split(";");
    }
    
}
