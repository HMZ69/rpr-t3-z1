package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    MobilniBroj(int mobilnaMreza, String broj) {
        switch(mobilnaMreza) {
            case 60: this.broj = "060/" + broj; break;
            case 61: this.broj = "061/" + broj; break;
            case 62: this.broj = "062/" + broj; break;
            case 63: this.broj = "063/" + broj; break;
            case 64: this.broj = "064/" + broj; break;
            case 65: this.broj = "065/" + broj; break;
            case 66: this.broj = "066/" + broj; break;
            case 67: this.broj = "067/" + broj; break;
        }
    }

    public String getBroj() { return this.broj; }

    @Override
    public String ispisi() {
        return this.getBroj();
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
