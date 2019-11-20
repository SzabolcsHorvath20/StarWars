package starwars;

import java.util.Random;

public class AnakinSkywalker extends Jedi implements Sith{

    public AnakinSkywalker() {
        super(150, true);
    }

    @Override
    public void engeddElAHaragod() {
        Random rnd = new Random();
        double randomSzam = rnd.nextInt(10);
        super.setEro(getEro()+randomSzam);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        if (mekkoraAzEreje() > 1000) {
            return true;
        }
        else
        {
        return false;
        }
    }

    @Override
    public String toString() {
        return "AnakinSkywalker{"+ super.toString() +'}';
    }

    @Override
    public boolean legyoziE(EroErzekeny eroErzekeny) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
