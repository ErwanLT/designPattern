package behavioral.chainResponsability.gestionnaire;

import behavioral.chainResponsability.model.RequeteRemboursement;

public class GestionnaireRemboursementGrand extends GestionnaireRemboursementBase{
    public GestionnaireRemboursementGrand(GestionnaireRemboursement suivant) {
        super(suivant);
    }

    @Override
    protected boolean peutTraiter(RequeteRemboursement requete) {
        return requete.montant() <= 10000;
    }

    @Override
    protected void traiter(RequeteRemboursement requete) {
        System.out.println("Remboursement approuvé par le gestionnaire de grands montants.");
    }
}
