public class Adresse{
    private String Rue;
    private String Ville;
    private String CodePostale;

    public String getVille() {
        return Ville;
    }
    public void setVille(String ville) {
        Ville = ville;
    }
    public String getCodePostale() {
        return CodePostale;
    }
    public void setCodePostale(String codePostale) {
        CodePostale = codePostale;
    }

    Adresse(String r,String v,String cp){
        Rue = r;
        Ville = v;
        CodePostale = cp;
    }

}
