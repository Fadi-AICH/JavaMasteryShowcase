public class Main {
    public static void main(String[] args) {

        Adresse AdresseAnas1 = new Adresse("dar tounssi", "Tanger", "cp11");
        Adresse AdresseAnas2 = new Adresse("houmet chouk", "Tanger", "cp12");
        Adresse AdresseAnas3 = new Adresse("Oudayas", "Rabat", "cp13");
        Adresse AdresseFadi1 = new Adresse("Forossiya","Beni Mellal","cp21");
        Adresse AdresseFadi2 = new Adresse("kawassim","Essaouira","cp22");
        Adresse AdresseFadi3 = new Adresse("Bernoussi","CasaBlanca","cp23");

        Adresse[] AdressesFadi = {AdresseFadi1,AdresseFadi2,AdresseFadi3};
        Adresse[] AdressesAnas = {AdresseAnas1, AdresseAnas2, AdresseAnas3};

        Personne Fadi = new Personne("Aich",'M',AdressesFadi);
        Personne Anas = new Personne("Elbadre", 'M', AdressesAnas);
        Personne[] Personnes = {Fadi,Anas};
        ListePersonnes LP = new ListePersonnes(Personnes);

        System.out.println("-> Recherche par Nom : "+LP.FindByName("Elbadre"));
        System.out.println("-> Recherche Par Code Postale : "+LP.FindCodePostal("cp22"));

        System.out.println("-> Nombre des Objets ayant une adresse dans la ville en parametre : "+LP.CountPersonnesVille("Tanger"));

        LP.editPersonneNom("Aich","Elhamdouchi");
        System.out.println("-> Recherche par Nom : "+LP.FindByName("Elhamdouchi"));

        LP.editPersonneville("Elhamdouchi","dakhla");

        // ici pour chaque adresse  dans l'ensemble des adresses de fadi on affiche la ville
        for(Adresse Adr : Fadi.getAdresses()) {
            System.out.println(Adr.getVille());
        }




    }
}