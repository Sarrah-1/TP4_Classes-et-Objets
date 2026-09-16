# TP 4 : Associations entre Classes et Objets en Java

Ce projet regroupe les exercices du TP 4 portant sur la programmation orientée objet (POO) en Java, la gestion dynamique des tableaux, les associations entre objets (1-à-1, 1-à-plusieurs, plusieurs-à-plusieurs) et la structuration en packages sous Eclipse.

---

## 🛠️ Description des Exercices

### **Exercice 1 : Etudiant et Tableau de Notes**
* Implementation d'une classe Etudiant gérant un tableau dynamique de notes (`double[]`).
* Auto-incrémentation des identifiants via une variable `static`.
* Calcul de la moyenne et redimensionnement automatique du tableau (`System.arraycopy`).

### **Exercice 2 : Association Etudiant ↔ Filière**
* Relation 1-à-plusieurs entre `Filiere` et `Etudiant`.
* Gestion bidirectionnelle de l'association.
* Agrandissement dynamique de la capacité d'accueil des étudiants par filière.

### **Exercice 3 : Gestion des Articles par Catégorie**
* Structuration stricte selon les packages imposés (`ma.projet.bean` et `ma.projet.test`).
* Stockage et affichage réalisés exclusivement avec des tableaux basiques (`Article[]`, `Categorie[]`) et des boucles imbriquées.

### **Exercice 4 : Auteurs, Livres et Bibliothèques**
* Modélisation d'associations complexes :
  * **1-à-plusieurs (Auteur ↔ Livre)** via `List<Livre>`.
  * **Plusieurs-à-plusieurs (Bibliothèque ↔ Livre)** via `Set<Livre>`.
* Auto-liaison des objets lors de l'instanciation dans les constructeurs.

---

## 📁 Structure du Projet

```text
TPAssociations/
└── src/
    ├── com.example.tp/        # Exercice 1 : Etudiant & Notes
    │   ├── Etudiant.java
    │   └── MainEx1.java
    │
    ├── com.example.tp2/       # Exercice 2 : Etudiant ↔ Filière (Array dynamique)
    │   ├── Etudiant.java
    │   ├── Filiere.java
    │   └── Main.java
    │
    ├── ma.projet.bean/        # Exercice 3 : Categorie & Article (Classes Métier)
    │   ├── Article.java
    │   └── Categorie.java
    │
    ├── ma.projet.test/        # Exercice 3 : Application de Test (Tableaux & Boucles)
    │   └── TestApp.java
    │
    └── com.example.tp4/       # Exercice 4 : Auteurs, Livres & Bibliothèques
        ├── Auteur.java
        ├── Livre.java
        ├── Bibliotheque.java
        └── Main.java 
```
### 🎬 Démo Vidéo

### 👤 Auteur
OUADAY SARA
