package fr.le_campus_numerique.java.dd.game;

import fr.le_campus_numerique.java.dd.personnage.Personnage;
import fr.le_campus_numerique.java.dd.personnage.Magicien;
import fr.le_campus_numerique.java.dd.personnage.Guerrier;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

//    public void startGame() {
//        Personnage player = createPlayer();
//        Game game = new Game(player);
////        playGame(game);
//    }

    public Personnage createPlayer() {
        while (true) {
//                        displayWithDelay("Vous vous réveillez dans une pièce étrange.", 1000);
//                        displayWithDelay("Vous ne vous rappelez pas comment vous êtes arrivé ici, ni même de vous être endormi.", 2000);
//                        displayWithDelay("Vous regardez autour de vous, vous voyez une porte fermée et une autre ouverte.", 2000);
//                        displayWithDelay("Vous décidez d'avancer vers la porte ouverte et vous vous retrouvez devant une tablette en pierre.", 2000);
//                        displayWithDelay("Elle contient un clavier, en pierre aussi.", 1000);
//                        displayWithDelay("Il est écrit dessus : 'Bienvenue aventurier, que voulez-vous faire ?'", 2000);
                        displayWithDelay("Taper 'creer' pour créer une partie ou 'exit' pour quitter la partie :", 1000);
//                        displayWithDelay("Quittez la partie à vos risques et périls.", 1000);

            String input = scanner.nextLine();
            checkExit(input);

            if (!input.equalsIgnoreCase("creer")) {
                System.out.println("Entrée non valide. Veuillez réessayer.");
                continue;
            }

            String nom = getInput("Entrez votre nom :");
            String type = getInput("Entrer le type du personnage (Magicien ou Guerrier) :");

            Personnage personnage;
            if (type.equalsIgnoreCase("Magicien")) {
                personnage = new Magicien(nom);
            } else if (type.equalsIgnoreCase("Guerrier")) {
                personnage = new Guerrier(nom);
            } else {
                System.out.println("Type non reconnu. Création d'un Magicien par défaut.");
                personnage = new Magicien(nom);
            }
            afficherPersonnage(personnage);
            modify(personnage);
            displayWithDelay("Vous voyez des vêtements apparaître sur vous, cela ressemble à une tenue de " + personnage.getType(), 2000);

            return personnage;
        }
    }

    public void welcome(Personnage personnage) {
        System.out.println("Bienvenue dans le jeu, " + personnage.getNom() + " !");
        System.out.println("Vous commencez sur la case 1.");
    }

    public void nextTurn() {
        System.out.println("\nAppuyez sur Entrée pour lancer le dé...");
        scanner.nextLine();
    }

    public void displayRollDice(int roll){
        System.out.println("Vous avez lancé un " + roll);
    }

    public void displayCase(int currentPosition, int boardSize){
        System.out.println("Vous êtes maintenant sur la case " + (currentPosition + 1) + " / " + boardSize);
    }

    public void displayFinished(){
        System.out.println("\nFélicitations ! Vous avez trouvez une sortie !");
        System.out.println("Vous vous réveillez dans votre lit et réalisez que tout cela n'était qu'un rêve !!!");
    }

    public void displayError(PersonnageHorsPlateauException e){
        System.out.println(e.getMessage());
    }

    public String askToPlayAgain() {
        System.out.println("Voulez-vous jouer à nouveau ? (oui/non)");
        String answer = scanner.nextLine().toLowerCase();

        return answer;
    }


    private void checkExit(String input) {
        if (input.equalsIgnoreCase("exit")) {
            for(int i=0; i < 5; i++){
                displayWithDelay("SOYEZ MAUDIT AVENTURIER !!!!", 1000);
            }
            System.out.println("Vous mourrez !!! AHAHAHAHAHAHAHAHAHAHAHAHAHAHAH!!!!!!!!!!!!!!!!!!!");
            System.out.println("                                                                                                      \n" +
                    "                                                                                                      \n" +
                    "                            %%*#=***********                                                          \n" +
                    "                   *#@@@@@%###%%+=+=++++++++*+=+++                                                    \n" +
                    "              ##*++::+@@@%@%##%@#=--====++=++++=+==+**                                                \n" +
                    "      %@+  @@@%+++==::+@%@%@@%#%%*=---======+=======++***=                                            \n" +
                    "     %%@-#@@@@%#*+==-::=%@@@#%#*@%#=---==============++*+##%                                          \n" +
                    "     +%@-#@@@@@*++=---::=*#+++=--=+========+=+=======+++++**+*                                        \n" +
                    "     =%@=*@@@@@%++*+-=-:-:-                       =+++++**+*+++#                                      \n" +
                    "      #@-+@@@@@*=-:::                                  *++**++++%%                                    \n" +
                    "      #@=+@@@@*=:                                           *+++#%@@                                  \n" +
                    "      @@*-@@@*                                                 =*#%@@                                 \n" +
                    "      @@#.%%                                                       #%@@                               \n" +
                    "      @@%=                                                            %@                              \n" +
                    "       %*-                                                              @                             \n" +
                    "       @%=                              #=---=.                           :                           \n" +
                    "       @%*                            @@%#=--====                                                     \n" +
                    "       %%+#                          @@@@%+======%                                                    \n" +
                    "       *%*@                          @@@@@@@%*===*@                                                   \n" +
                    "        %=%                          @@@@@@@@@@*==#@                                                  \n" +
                    "        @+*                         @@@@@#%@#%@@#==+#                                                 \n" +
                    "        %-+                         @@@@*==++#%#@%==+#                                                \n" +
                    "        %+-@                       #@@@@%#+-=*%%%@%===#                                               \n" +
                    "         #=%                       @%@@@@@#==@@@*#@#====                                              \n" +
                    "         %=*                      @@#@@@+*=%#=+++%@%+==*                                              \n" +
                    "         @==:                    +*@%@@@*-=@@*=*@@@@*++=+                                             \n" +
                    "          =--                   +=*@%@@@@*=+===+@@@@%=*==+                                            \n" +
                    "         +=--+=                @*+%@%@@@@@++++*#@@@@@+*+==++                                          \n" +
                    "       :=-*==+=                @@@%@+#@@@@##**+@@@@@@%=*+=+++                                         \n" +
                    "       ----+:=#             @%@@@@@@*=@@@@@@#*#@@@@@@@*=++++++                                        \n" +
                    "       --::+*+#         @+*%@*+%@@@@*%%@@@@@@@@@@@@@@@@+==*++++                                       \n" +
                    "       =-::=@**      #@@@%%=+%#*@@@@=###@@@@@@@@@@@@@@@@#+*+++++                                      \n" +
                    "       ==::+ @=#    @%##%@@%#*###@@@#*%%*#@@@@@@@@@@@@@@@%++*+++*%                                    \n" +
                    "      :::::   #+= @@@@#::=%@@*+*%%%@@%#%%*#@@@@@@@@@@@@@@@%++**#*#@                                   \n" +
                    "      ++.-+   @##*@@@@@-:::+@%*+=@**@@@@@%###@@@@@@@@@@@@@@%*+####%                                   \n" +
                    "      %  :@    @+#%@@@%%::::+@@++=***@@@@@@@+#*%@@@@@@@@@@@@@#+%#%%%                                  \n" +
                    "      #  :=  #@@#+%%#@@@*::::-#@++==+*%**%@@@##+*#@@@@@@@@@@%@%##*%@%                                 \n" +
                    "     :   =   @@@@#-#==%@@%:::-=+@%=+-=%%==*%@@@*+*+#@@@@@@@@%@%%@%*#@@%                               \n" +
                    "     -   *  :@@%@@#=++=%@@*:::=%+%%+++=**--+%@@%#*+==+*%@@@@@@@%%@@+#@@##                             \n" +
                    "     =   #  @@@@+%@*-+#-#@@#-::-+%#@%++-=+=-=##@@%*+#+==+%@@@@@@%%@#*%@%**#                           \n" +
                    "    %+   @ @@@@%%+%@*==*:=#@%+-::=%#%%#++=+=-==*%@%@%@##=+*%@@@@@##@#+#%%****                         \n" +
                    "   @@#@@*@@@@@@@@%*%@+=-*--##%%-:--*#*%%*+=--=====%@%@@@%+++#%@@@@@@@#**#%#***#                       \n" +
                    "  %@@@@@%@@@@@@@@%%%#@%+-*-:*##%*----*#%@%++-=====*@@@%%@%#%#+*#%@@@@@%**#%#****#                     \n" +
                    "  -@@@@@@@@@@@@@#@#@++@%#=*+:*@#*%=---=+*%@%*======*@@%#++#%@@#+*#%@@@@%***#%%#**#+                   \n" +
                    "   *@@@@@@@@@@@@%@@%*:=@%%=*+:*@#*@#=---+#%@@%+=====+%%#*+++*#%@@%#*#%@@%***##%%#*##                  \n" +
                    "   =%@@@@@@@@@@@@@@%%=:-%%%+++:#@++*%#=--=+##%%@#+====%%##++++++#%@@%%%%@@****#%%%###                 \n" +
                    "   --@@@@@@@@@@@@@@@@+::-##%+**-#%**=%@*---=+#%%@@%+===#@*#+++++*@%#%%@@%%@#****##@###                \n" +
                    "   #.=@@@@@@@@@@@%%@%%:--:#@#+#*=*@%**#@#+---=+*%%#@%#++%%##*++++*%%%%#%%%#%@#****#####               \n" +
                    "    * :#@@@@@@@@@@@###*----*@#++#=+@@*#*#%#*=====*##@@@%%%@%##*++++*%@@%@@%##%%***######              \n" +
                    "    @=..*@@@@@@@@@@@@#%=*=+=+@@**#==%%%%++*#%*=====*%@@@@@@@@%##*++++*%@@@@##**##*######%             \n" +
                    "     #=..-%@@@@@@@@@@@%%*=-+-=%@%=*=-*@@#*==*%%##+##%#%@@@@%@@%%%#++++**%%%%##**#########%            \n" +
                    "     @*=...#@@@@@@@@@@@@@*-==+=#%*=*+-=#@##+-=*#%@###%%@%%%%%%@@%%%**+***##%%%#**########%=           \n" +
                    "      @*-...+@@@@@@@@@@%@@*:+=+=#@#+*=-+%*@**===+#%@#%@@@@%%%##@%#%%%******#%%@#**########%           \n" +
                    "        #==:.:#@@@@@@@@@@@%+#-==-*@#+*+-+#@%%#+====+*%%@%%%#%%####%%%@%*****#%@@%*#########%          \n" +
                    "         %%=:..=%@@@%@@@%@@###++-+*@#*#*--*#%%%*=======++**####%%##%%%%%#******#@%#########%%         \n" +
                    "          %@+:..:=%@@@@@@@@@@#%*+*==@@#**=-=+#@@@#+=======++++*+*%###%##%%%#****#%@#########%         \n" +
                    "           @@#:...:*@@@@@@@@@**%*++=*@@##*=-=+*@@@@%*=====+++++****########%%##***#@%########%        \n" +
                    "              %-....-#@@@@@@@@%=%#+=+=#%*%==-==+%%%%@%*+++++++++++***#%*#####%%#####%@%######%#       \n" +
                    "                ===:::-#@@@@@@@#***++==*%%#=+====###%%@@%@#+++++++++++*####*##*%@%%%%@@@######%       \n" +
                    "                  *==++--*@@@@@@#*#*+++**@%*++====+*#%@@%@@@%#*+++++++***********##%%%%@%%####%@      \n" +
                    "                   *+=+=++-+#@@@@%*#++==*+%%#+*+===+=*#%%%#%@@@@%#*+++************####%%@@@%#%%%      \n" +
                    "                     *++*+**+=@@@@%#*+===++%%#+**+=++==*+#%#%%%@@@@@%*************#######%@@%%%@@     \n" +
                    "                      %++++**++=%@%###=====+#%#+###++====++**#%%%%%@@@@%**********########%%@%%%@     \n" +
                    "                       .##++=*==*+%@#%+==-=+=*%*+***#+====++++*#*#%%%@%%@@#*******#####     =%%%@@    \n" +
                    "                          #+*++=**-*@%*+++====+%%*+*+%#+==+++++++#*#%@@%%@@@#*****####%        %@@    \n" +
                    "                            +*=#**#==%%+**+=-===%%++*+#@#*++++++++++*#%%#%@@@%#***####%          %@   \n" +
                    "                                : %#=-+%#%*#+====%%++*+*%@##*++++++++*#%%%@     **#####               \n" +
                    "                                   #%=--#@%##+====#%*++*=*#@@%##++++++   *%       #####%              \n" +
                    "                                     %=--*  %#*====*#*%*%+++#@@@%#*+++              ####=             \n" +
                    "                                       +--*  +#*+===*%#@*%++++#%%####*#               ###             \n" +
                    "                                        =--#   #**++=*@#%*#+++++*******#                ##            \n" +
                    "                                          =-+    ##+++*@%%##++++++++   **                 :           \n" +
                    "                                            =+     :%*#%@@%##*++++*+      *                           \n" +
                    "                                              *        *%@%##**++++                                   \n" +
                    "                                                           %****++++                                  \n" +
                    "                                                            #+*##**++                                 \n" +
                    "                                                             %###  ****                               \n" +
                    "                                                              %%%-     ##                             \n" +
                    "                                                               %@%         #                          \n" +
                    "                                                                #@%                                   \n" +
                    "                                                                 %@%                                  \n" +
                    "                                                                 +%##                                 \n" +
                    "                                                                  %#*#                                \n" +
                    "                                                                   %#**                               \n" +
                    "                                                                    ##*%                              \n" +
                    "                                                                    -%#**                             \n" +
                    "                                                                     @%#*                             \n" +
                    "                                                                      @%%*                            \n" +
                    "                                                                       @##*                           \n" +
                    "                                                                       #%#**                          \n" +
                    "                                                                        @##*+                         \n" +
                    "                                                                         %%**                         \n" +
                    "                                                                          %#*#                        \n" +
                    "                                                                          %#**#                       \n" +
                    "                                                                           %%#*                       \n" +
                    "                                                                            %%**                      \n" +
                    "                                                                            %%#**                     \n" +
                    "                                                                             %##*:                    \n" +
                    "                                                                              %##*                    \n" +
                    "                                                                              @@%*#                   \n" +
                    "                                                                               @%*#-                  \n" +
                    "                                                                               @@###                  \n" +
                    "                                                                                @@###                 \n" +
                    "                                                                                @@%##                 \n" +
                    "                                                                                  *###                \n" +
                    "                                                                                                      \n" +
                    "                                                                                                      \n" +
                    "                                                                                                      \n");
            System.exit(0);
        }
    }

    private String getInput(String message) {
        System.out.println(message);
        String input = scanner.nextLine();
        checkExit(input);
        return input;
    }

    public void modify(Personnage personnage) {
        while (true) {
            System.out.println("\nQue voulez-vous modifier ?");
            System.out.println("1. Nom");
            System.out.println("2. Type");
            System.out.println("3. Terminer les modifications");

            String choix = getInput("Entrez votre choix (1, 2 ou 3) :");

            switch (choix) {
                case "1":
                    String nouveauNom = getInput("Entrez le nouveau nom :");
                    personnage.setNom(nouveauNom);
                    System.out.println("Nom modifié avec succès.");
                    break;
                case "2":
                    String nouveauType = getInput("Entrez le nouveau type (Magicien ou Guerrier) :");
                    if (nouveauType.equalsIgnoreCase("Magicien")) {
                        personnage = new Magicien(personnage.getNom());
                        System.out.println("Type modifié avec succès.");
                    }else if(nouveauType.equalsIgnoreCase("Guerrier")){
                        personnage = new Guerrier(personnage.getNom());
                        System.out.println("Type modifié avec succès.");
                    } else {
                        System.out.println("Type non valide. Le type n'a pas été modifié.");
                    }
                    break;
                case "3":
                    System.out.println("Modifications terminées.");
                    afficherPersonnage(personnage);
                    return;
                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
            }
        }
    }

    public void afficherPersonnage(Personnage personnage){
        System.out.println(personnage);
    }

    public void displayWithDelay(String message, int delay){
        try {
            Thread.sleep(delay);
            System.out.println(message);
        }catch (InterruptedException e) {
            System.err.println("Une interruption a eu lieu : " + e.getMessage());
        }
    }
}
