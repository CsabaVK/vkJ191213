/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auceania;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 */
class Auceania
{
    private String elnevezes;
    private int terulet;
    private int lakossag;

    public Auceania(String elnevezes, int terulet, int lakossag) 
    {
        this.elnevezes = elnevezes;
        this.terulet = terulet;
        this.lakossag = lakossag;
    }

    public String getElnevezes() 
    {
        return elnevezes;
    }

    public int getTerulet() 
    {
        return terulet;
    }

    public int getLakossag() 
    {
        return lakossag;
    }
    
    public Auceania(String sor)
    {
        String [] d = sor.split(";");
        this.elnevezes = d[0];
        this.terulet = Integer.parseInt(d[1]);
        this.lakossag = Integer.parseInt(d[2]);
    }
    public double nepsuruseg()
    {
        return ((double) lakossag/terulet);
    }
}
public class Foldrajz 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Auceania> lista = new ArrayList<>();
        try 
        {
            FileReader fajl = new FileReader("ausztralia_oceania.txt");
            BufferedReader br = new BufferedReader(fajl);
            String sor = null;
            while ((sor = br.readLine())!=null) 
            {                
                Auceania a = new Auceania(sor);
                lista.add(a);
            }
        } 
        catch (Exception hiba) 
        {
            System.out.println("Nem található a fájl");
        }
        
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i).getElnevezes());
            System.out.println(lista.get(i).nepsuruseg());
        }
    }
    
}
