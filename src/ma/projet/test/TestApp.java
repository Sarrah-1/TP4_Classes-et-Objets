package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {
    public static void main(String[] args) {
        Categorie[] categories = new Categorie[2];
        categories[0] = new Categorie("PC", "PR");
        categories[1] = new Categorie("PC Poste", "PO");

        Article[] articles = new Article[4];
        articles[0] = new Article(11, "HP", categories[0]);
        articles[1] = new Article(12, "DELL", categories[0]);
        articles[2] = new Article(13, "LENOVO", categories[1]);
        articles[3] = new Article(14, "ACER", categories[1]);

        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i].getLibelle() + " :");
            for (int j = 0; j < articles.length; j++) {
                if (articles[j].getCategorie().getId() == categories[i].getId()) {
                    System.out.println("  - " + articles[j]);
                }
            }
            System.out.println();
        }
    }
}