package behavioral.chainResponsability.gestionnaire;

import behavioral.chainResponsability.model.RequeteRemboursement;

public abstract class GestionnaireRemboursementBase implements GestionnaireRemboursement{
    private GestionnaireRemboursement suivant;

    public GestionnaireRemboursementBase(GestionnaireRemboursement suivant) {
        this.suivant = suivant;
    }

    public void traiterRemboursement(RequeteRemboursement requete) {
        if (peutTraiter(requete)) {
            traiter(requete);
        } else if (suivant != null) {
            suivant.traiterRemboursement(requete);
        } else {
            System.out.println("Aucun gestionnaire disponible pour traiter la requête.");
        }
    }

    protected abstract boolean peutTraiter(RequeteRemboursement requete);
    protected abstract void traiter(RequeteRemboursement requete);
}
