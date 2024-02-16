package behavioral.chainResponsability.gestionnaire;

import behavioral.chainResponsability.model.RequeteRemboursement;

public class GestionnaireRemboursementInvalide extends GestionnaireRemboursementBase{
    public GestionnaireRemboursementInvalide() {
        super(null);
    }

    @Override
    protected boolean peutTraiter(RequeteRemboursement requete) {
        return true;
    }

    @Override
    protected void traiter(RequeteRemboursement requete) {
        System.out.println("Erreur : Aucun gestionnaire disponible pour traiter la requête.");
    }
}
