package behavioral.chainResponsability.gestionnaire;

import behavioral.chainResponsability.model.RequeteRemboursement;

public class GestionnaireRemboursementMoyen extends GestionnaireRemboursementBase{
    public GestionnaireRemboursementMoyen(GestionnaireRemboursement suivant) {
        super(suivant);
    }

    @Override
    protected boolean peutTraiter(RequeteRemboursement requete) {
        return requete.montant() <= 1000;
    }

    @Override
    protected void traiter(RequeteRemboursement requete) {
        System.out.println("Remboursement approuvé par le gestionnaire de moyens montants.");
    }
}
