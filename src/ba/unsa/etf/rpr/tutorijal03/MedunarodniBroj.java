package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {

    MedunarodniBroj(String drzava, String broj) {
        this.broj = drzava + "/" + broj;
    }

    public String getBroj() {
        return this.broj;
    }

    @Override
    public String ispisi() {
        return this.getBroj();
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
