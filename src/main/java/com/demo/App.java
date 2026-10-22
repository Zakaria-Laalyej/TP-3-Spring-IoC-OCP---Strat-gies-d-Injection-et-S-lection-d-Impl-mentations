package com.demo;
import com.demo.config.AppConfig;
import com.demo.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Crée le conteneur Spring
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.getEnvironment().setActiveProfiles("prod");

        // Récupère le bean métier
        IMetier metier = context.getBean("metierImpl",IMetier.class);

        // Exécute le calcul
        double resultat = metier.calcul();
        System.out.println("Résultat final : " + resultat);

        // Ferme le conteneur
        context.close();
    }
}