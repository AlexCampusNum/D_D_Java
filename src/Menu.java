import Personnage.Personnage;

import java.util.Scanner;
import Personnage.Magicien;
import Personnage.Guerrier;

public class Menu {
    private final Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public Personnage showMenu() {
        while (true) {
//            displayWithDelay("Vous vous réveillez dans une pièce étrange.");
//            displayWithDelay("Vous ne vous rappelez pas comment vous êtes arrivé ici, ni même de vous être endormi.");
//            displayWithDelay("Vous regardez autour de vous, vous voyez une porte fermée et une autre ouverte.");
//            displayWithDelay("Vous décidez d'avancer vers la porte ouverte et vous vous retrouvez devant une tablette en pierre.");
//            displayWithDelay("Elle contient un clavier, en pierre aussi.");
//            displayWithDelay("Il est écrit dessus : 'Bienvenue aventurier, que voulez-vous faire ?'");
            displayWithDelay("Taper 'creer' pour créer une partie ou 'exit' pour quitter la partie :");
//            displayWithDelay("Quittez la partie à vos risques et périls.");

            String input = scanner.nextLine();
            checkExit(input);

            if (input.equalsIgnoreCase("creer")) {
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
                System.out.println("Vous voyez des vêtements apparaître sur vous, cela ressemble à une tenue de " +personnage.getType());

                return personnage;
            } else {
                System.out.println("Entrée non valide. Veuillez réessayer.");
            }
        }
    }

    private void checkExit(String input) {
        if (input.equalsIgnoreCase("exit")) {
            for(int i=0; i < 5; i++){
                displayWithDelay("SOYEZ MAUDIT AVENTURIER !!!!");
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
                    personnage.setName(nouveauNom);
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

    public void displayWithDelay(String message){
        try {
            Thread.sleep(2000);
            System.out.println(message);
        }catch (InterruptedException e) {
            System.err.println("Une interruption a eu lieu : " + e.getMessage());
        }
    }
}
