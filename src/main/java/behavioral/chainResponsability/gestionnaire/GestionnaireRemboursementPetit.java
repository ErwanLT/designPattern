package behavioral.chainResponsability.gestionnaire;

import behavioral.chainResponsability.model.RequeteRemboursement;

public class GestionnaireRemboursementPetit extends GestionnaireRemboursementBase{
    public GestionnaireRemboursementPetit(GestionnaireRemboursement suivant) {
        super(suivant);
    }

    @Override
    protected boolean peutTraiter(RequeteRemboursement requete) {
        return requete.montant() <= 100;
    }

    @Override
    protected void traiter(RequeteRemboursement requete) {
        System.out.println("Remboursement approuvé par le gestionnaire de petits montants.");
    }
}
