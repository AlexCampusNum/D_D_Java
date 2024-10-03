import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(){
        scanner = new Scanner(System.in);
    }

    public showMenu(){
        System.out.println("Taper créer pour créer une partie ou exit pour quitter la partie :");
        String input = scanner.nextLine();
        if(input.equals("exit")){

            return System.exit(0);

        }else if(input.equals("créer")){
            System.out.println("Entrez votre nom : ");
            String nom = scanner.nextLine();
            System.out.println("Entrer le type du personnage (Magicien ou Guerrier) :");
            String type = scanner.nextLine();

            return new Personnage(nom, type);
        }
    }

//    public Personnage createPerso(){
//        System.out.println("Entrez votre nom : ");
//        String nom = scanner.nextLine();
//        System.out.println("Entrer le type du personnage (Magicien ou Guerrier) :");
//        String type = scanner.nextLine();
//
//        return new Personnage(nom, type);
//    }
}
