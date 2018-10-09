/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_204;

/**
 *
 * @author Richard Hofmeister
 */
public class Anlage {
    private String Bezeichnung;
    private double ak;
    private double inbetrnahme;
    private double nd;
    private double bishnd;
    private double afabish;
    private double wertvorafa;
    private double afadj;
    private double bw;

    public Anlage(String Bezeichnung, double ak, double inbetrnahme, double nd) {
        this.Bezeichnung = Bezeichnung;
        this.ak = ak;
        this.inbetrnahme = inbetrnahme;
        this.nd = nd;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public double getAk() {
        return ak;
    }

    public double getInbetrnahme() {
        return inbetrnahme;
    }

    public double getNd() {
        return nd;
    }

    public double getBishnd() {
        return bishnd;
    }

    public double getAfabish() {
        return afabish;
    }

    public double getWertvorafa() {
        return wertvorafa;
    }

    public double getAfadj() {
        return afadj;
    }

    public double getBw() {
        return bw;
    }
    
    
}
