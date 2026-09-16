package com.example.tp2;

public class Main {
    public static void main(String[] args) {
        Filiere info = new Filiere("TEE");
        Filiere genie = new Filiere("MATH");

        Etudiant e1 = new Etudiant("SARA", "OUADAY");
        Etudiant e2 = new Etudiant("HAMDI", "IMANE");
        Etudiant e3 = new Etudiant("BENTALEB", "AMINE");
        Etudiant e4 = new Etudiant("ZEEN", "KARIMA");
        Etudiant e5 = new Etudiant("CHOUIKH", "FATI");
        Etudiant e6 = new Etudiant("HAMDI", "FATIMA");

        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new Etudiant("LAMINA", "FATINE"));
        genie.ajouterEtudiant(new Etudiant("BENDROUB", "HAMID"));

        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        System.out.println("Détail de e3 : " + e3);
    }
}