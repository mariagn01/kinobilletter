package webprog.kinobilletter;

public class Billett {
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;
    private String film;
    private String antall;

    public Billett(String fornavn, String etternavn, String telefonnr, String epost, String film, String antall) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
        this.film = film;
        this.antall = antall;
    }

    public Billett() {}

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getEpost() {
        return epost;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getFilm() {
        return film;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getAntall() {
        return antall;
    }
}
