public class Stagiaire{
    private String Nom;
    private float[] notes;

    Stagiaire(String nom, float[] notes){
        this.Nom = nom;
        this.notes = notes;
    }

    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public float[] getNotes() {
        return notes;
    }
    public void setNotes(float[] notes) {
        this.notes = notes;
    }

    public Double CalculerMoyenne(){
        if(notes.length == 0) return null;
        double somme=0;
        for(int i=0;i<notes.length;i++){
            somme+=notes[i];
        }
        return somme/notes.length;
    }
    public Double TrouverMax(){
        if(notes.length == 0) return null;
        double max=notes[0];
        for(int i=1;i<notes.length;i++){
            if(notes[i]>max) max = notes[i];
        }
        return max;
    }
    public Double TrouverMin(){
        if(notes.length == 0) return null;
        double min=notes[0];
        for(int i=1;i<notes.length;i++){
            if(notes[i]<min) min = notes[i];
        }
        return min;
    }
}

