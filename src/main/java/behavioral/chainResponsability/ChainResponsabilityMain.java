package behavioral.chainResponsability;

import behavioral.chainResponsability.gestionnaire.*;
import behavioral.chainResponsability.model.RequeteRemboursement;

public class ChainResponsabilityMain {

    public static void main(String[] args){
        GestionnaireRemboursement gestionnaireInvalide = new GestionnaireRemboursementInvalide();
        GestionnaireRemboursement gestionnaireGrand = new GestionnaireRemboursementGrand(gestionnaireInvalide);
        GestionnaireRemboursement gestionnaireMoyen = new GestionnaireRemboursementMoyen(gestionnaireGrand);
        GestionnaireRemboursement gestionnairePetit = new GestionnaireRemboursementPetit(gestionnaireMoyen);

        // Simulation de différentes requêtes de remboursement
        RequeteRemboursement req1 = new RequeteRemboursement(50);
        RequeteRemboursement req2 = new RequeteRemboursement(500);
        RequeteRemboursement req3 = new RequeteRemboursement(5000);
        RequeteRemboursement req4 = new RequeteRemboursement(20000);

        // Traitement des requêtes
        gestionnairePetit.traiterRemboursement(req1);
        gestionnairePetit.traiterRemboursement(req2);
        gestionnairePetit.traiterRemboursement(req3);
        gestionnairePetit.traiterRemboursement(req4);
    }
}
