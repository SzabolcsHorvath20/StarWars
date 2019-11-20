package starwars;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StarWars {
    private static List<Sith> Sithek = new LinkedList<Sith>();
    
    static void szereplok(String eleresiUt) throws IOException
    {
        FileReader fr;
        try {
            fr = new FileReader(eleresiUt);
            BufferedReader br = new BufferedReader(fr);
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] split = sor.split(" ");
                if (split[0].equals("Anakin")) {
                    AnakinSkywalker seged = new AnakinSkywalker();
                    for (int i = 0; i < Integer.parseInt(split[1]); i++) {
                        seged.engeddElAHaragod();
                    }
                    Sithek.add(seged);
                }
                else if (split[0].equals("Uralkodo")) {
                    Uralkodo seged = new Uralkodo();
                    for (int i = 0; i < Integer.parseInt(split[1]); i++) {
                        seged.engeddElAHaragod();
                    }
                    Sithek.add(seged);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StarWars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void Sithek()
    {
        for (Sith sith : Sithek) {
            System.out.println(sith);
        }
    }
}
