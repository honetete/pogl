package Controleur;

import java.awt.event.*;

import Modele.CModele;

/**
 * Classe pour notre contrôleur rudimentaire.
 * 
 * Le contrôleur implémente l'interface [ActionListener] qui demande
 * uniquement de fournir une méthode [actionPerformed] indiquant la
 * réponse du contrôleur à la réception d'un événement.
 */
public class Controleur implements ActionListener {
    /**
     * On garde un pointeur vers le modèle, car le contrôleur doit
     * provoquer un appel de méthode du modèle.
     * Remarque : comme cette classe est interne, cette inscription
     * explicite du modèle est inutile. On pourrait se contenter de
     * faire directement référence au modèle enregistré pour la classe
     * englobante [VueCommandes].
     */
    CModele modele;
    public Controleur(CModele modele) { this.modele = modele; }
    /**
     * Action effectuée à réception d'un événement : appeler la
     * méthode [avance] du modèle.
     */
    
    public void actionPerformed(ActionEvent e) {
        modele.inondation();
    }
}
/** Fin du contrôleur. */
