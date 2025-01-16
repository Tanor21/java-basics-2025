package classandobject;

class Calculator {
    int a = 12;

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}


public class Demo {

    public static void main(String[] args) {
        System.out.println("============= Class and Object in Java =============");

        /*
            En Java, les classes et les objets sont les éléments fondamentaux de la programmation orientée objet (POO).
            Voici une explication détaillée des concepts :
            1. Qu'est-ce qu'une Classe ?
                Une classe est un modèle ou un plan (blueprint) qui définit les propriétés (attributs) et les
                comportements (méthodes) d'un objet. C'est une abstraction qui permet de structurer et d'organiser le code.
            2. Qu'est-ce qu'un Objet ?
                Un objet est une instance d'une classe. Il représente une entité spécifique basée sur le modèle défini `
                par la classe.
        */

        int num1 = 4;
        int num2 = 3;

        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);
        System.out.println(result);
        System.out.println(calculator.a);
    }
}
