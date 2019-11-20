/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

/**
 *
 * @author garru
 */
public abstract class Jedi implements EroErzekeny{

    private double ero;
    private boolean atallhatE;
    
    public Jedi(double ero, boolean atallhatE) {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }

    @Override
    public String toString() {
        return "ero=" + ero + ", atallhatE=" + atallhatE + '}';
    }

    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public boolean isAtallhatE() {
        return atallhatE;
    }

    public void setAtallhatE(boolean atallhatE) {
        this.atallhatE = atallhatE;
    }

    public abstract boolean megteremtiAzEgyensulyt();
    
    public boolean legyoziE(Jedi eroErzekeny) {
        if (eroErzekeny.ero < this.ero && eroErzekeny.atallhatE == true) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean legyoziE(Uralkodo eroErzekeny) {
        if (eroErzekeny.mekkoraAzEreje()*2 < this.ero) {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return this.ero;
    }
    
}
