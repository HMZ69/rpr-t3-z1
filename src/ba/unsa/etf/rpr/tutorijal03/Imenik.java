package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {

    private HashMap<TelefonskiBroj, String> imenik;

    Imenik() {
        this.imenik = new HashMap<TelefonskiBroj, String>();
    }

    public HashMap<TelefonskiBroj, String> getImenik() {
        return this.imenik;
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        this.getImenik().put(broj, ime);
    }

    public String dajBroj(String ime) {
        for (Map.Entry<TelefonskiBroj, String> entry : this.getImenik().entrySet()) {
            if (entry.getValue().equals(ime))
                return entry.getKey().toString();
        }
        return null;
    }

    public String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<TelefonskiBroj, String> entry : this.getImenik().entrySet()) {
            if (entry.getKey().equals(broj))
                return entry.getValue();
        }
        return null;
    }

    public String naSlovo(char s) {
        int index = 0;
        for (Map.Entry<TelefonskiBroj, String> entry : this.getImenik().entrySet()) {
            if (entry.getValue().charAt(0) == s) {
                index++;
                return index + ". " + entry.getValue() + " - " + entry.getKey().toString();
            }
        }
        return null;
    }

    Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> s = new TreeSet<>();
        for (Map.Entry<TelefonskiBroj, String> entry : this.getImenik().entrySet()) {
            TelefonskiBroj br = new FiksniBroj(g, entry.getKey().toString().replace("033/", ""));
            if (entry.getKey().toString().equals(br.toString())) {
                s.add(entry.getValue());
            }
        }
        return s;
    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> s = new TreeSet<>();
        for (Map.Entry<TelefonskiBroj, String> entry : this.getImenik().entrySet()) {
            TelefonskiBroj br = new FiksniBroj(g, entry.getKey().toString().replace("033/", ""));
            if (entry.getKey().toString().equals(br.toString()))
                s.add(entry.getKey());
        }
        return s;
    }
}
