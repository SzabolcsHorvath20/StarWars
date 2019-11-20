package starwars;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StarWarsOOP {

    public static void main(String[] args) {
        try {
            StarWars.szereplok("eroerzekenyek.txt");
            StarWars.Sithek();
        } catch (IOException e) {
            System.out.println(e);
        }
            
    }
    
}
