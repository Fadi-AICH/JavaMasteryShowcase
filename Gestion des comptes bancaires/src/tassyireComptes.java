import java.util.ArrayList;

public class tassyireComptes {
    private ArrayList<hissabeBancaire> comptes;

    public tassyireComptes() {
        comptes = new ArrayList<>();
    }

    public void ajouterCompte(hissabeBancaire compte) {
        comptes.add(compte);
    }

    public hissabeBancaire rechercherCompte(String numero) {
        for (hissabeBancaire c : comptes) {
            if (c.getNumero().equalsIgnoreCase(numero))
                return c;
        }
        return null;
    }

    public boolean supprimerCompte(String numero) {
        hissabeBancaire compte = rechercherCompte(numero);
        if (compte != null) {
            comptes.remove(compte);
            return true;
        }
        return false;
    }

    public void afficherTousLesComptes() {
        if(comptes.isEmpty()) {
            System.out.println("Aucun compte disponible.");
        } else {
            for (hissabeBancaire c : comptes) {
                System.out.println(c);
            }
        }
    }

    // transfer d lflouse
    public boolean transfert(String fromNumero, String toNumero, double montant) {
        hissabeBancaire fromCompte = rechercherCompte(fromNumero);
        hissabeBancaire toCompte = rechercherCompte(toNumero);
        if(fromCompte == null || toCompte == null) {
            return false;
        }
        if(fromCompte.debit(montant)) {
            toCompte.credit(montant);
            fromCompte.addHistorique("Transfert de " + montant + " vers compte " + toNumero);
            toCompte.addHistorique("Transfert de " + montant + " depuis compte " + fromNumero);
            return true;
        }
        return false;
    }
}
