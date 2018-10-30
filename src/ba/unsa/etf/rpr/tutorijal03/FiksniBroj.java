package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj implements Comparable<TelefonskiBroj> {

    public enum Grad { SARAJEVO, BIHAC, ORASJE, TUZLA, ZENICA, GORAZDE, TRAVNIK, MOSTAR, SIROKIBRIJEG, LIVNO, BRCKO }

    FiksniBroj(Grad grad, String broj) {
        switch(grad) {
            case BIHAC: this.broj = "037/" + broj; break;
            case ORASJE: this.broj = "031/" + broj; break;
            case TUZLA: this.broj = "035/" + broj; break;
            case ZENICA: this.broj = "032/" + broj; break;
            case GORAZDE: this.broj = "038/" + broj; break;
            case TRAVNIK: this.broj = "030/" + broj; break;
            case MOSTAR: this.broj = "036/" + broj; break;
            case SIROKIBRIJEG: this.broj = "039/" + broj; break;
            case SARAJEVO: this.broj = "033/" + broj; break;
            case LIVNO: this.broj = "034/" + broj; break;
            case BRCKO: this.broj = "049/" + broj; break;
        }
    }

    public String getBroj() {
        return this.broj;
    }

    @Override
    public String ispisi() {
        return this.getBroj();
    }

    @Override
    public int compareTo(TelefonskiBroj drugiBroj) {
        return this.ispisi().compareTo(drugiBroj.ispisi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getBroj());
    }

    @Override
    public String toString() {
        return this.getBroj();
    }
}
