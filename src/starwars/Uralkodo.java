package starwars;

public class Uralkodo implements EroErzekeny, Sith{

    private double gonoszsag;

    public Uralkodo() {
        this.gonoszsag = 100;
    }
    
    
    
    @Override
    public boolean legyoziE(EroErzekeny eroErzekeny) {
        if (this.gonoszsag > eroErzekeny.mekkoraAzEreje()) {
            return true;
        }
        else
        {
        return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return gonoszsag*2;
    }

    @Override
    public void engeddElAHaragod() {
        this.gonoszsag += 50;
    }

    @Override
    public String toString() {
        return "Uralkodo{" + "Ero = " + this.mekkoraAzEreje() + "gonoszsag = " +  gonoszsag + '}';
    }
    
    
    
}
