package fr.le_campus_numerique.java.dd.game;

import fr.le_campus_numerique.java.dd.player.Player;
import fr.le_campus_numerique.java.dd.player.Wizard;
import fr.le_campus_numerique.java.dd.player.Warrior;
import java.util.Scanner;

/**
 * Represents the menu system for the game.
 * This class handles player creation, game flow, and user interactions.
 */
public class Menu {
    private final Scanner scanner;

    /**
     * Constructs a new Menu object.
     * Initializes the scanner for user input.
     */
    public Menu() {
        scanner = new Scanner(System.in);
    }

    /**
     * Creates a new player based on user input.
     *
     * @return The created Player object
     */
    public Player createPlayer() {
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

            String name = getInput("Entrez votre nom :");
            String type = getInput("Entrer le type du personnage (Magicien ou Guerrier) :");

            Player player;
            if (type.equalsIgnoreCase("Magicien")) {
                player = new Wizard(name);
            } else if (type.equalsIgnoreCase("Guerrier")) {
                player = new Warrior(name);
            } else {
                System.out.println("Type non reconnu. Création d'un Magicien par défaut.");
                player = new Wizard(name);
            }
            displayPlayer(player);
            modify(player);
            displayWithDelay("Vous voyez des vêtements apparaître sur vous, cela ressemble à une tenue de " + player.getType(), 2000);

            return player;
        }
    }

    /**
     * Displays a welcome message for the player.
     *
     * @param personnage The Player object to welcome
     */
    public void welcome(Player personnage) {
        System.out.println("Bienvenue dans le jeu, " + personnage.getName() + " !");
        System.out.println("Vous commencez sur la case 1.");
    }

    /**
     * Asks the player if they want to use a potion.
     *
     * @return The player's response as a String
     */
    public String askUsePotion() {
        System.out.println("Voulez-vous utiliser une potion ? (oui/non)");
        String result = scanner.nextLine();

        return result;
    }

    /**
     * Prompts the player to start the next turn.
     */
    public void nextTurn() {
        System.out.println("\nAppuyez sur Entrée pour lancer le dé...");
        scanner.nextLine();
    }

    /**
     * Displays the result of a dice roll.
     *
     * @param roll The result of the dice roll
     */
    public void displayRollDice(int roll){
        System.out.println("Vous avez lancé un " + roll);
    }

    /**
     * Displays the current position of the player on the board.
     *
     * @param currentPosition The current position of the player
     * @param boardSize The total size of the game board
     */
    public void displayCase(int currentPosition, int boardSize){
        System.out.println("Vous êtes maintenant sur la case " + (currentPosition + 1) + " / " + boardSize);
    }

    /**
     * Displays a message when the game is finished.
     */
    public void displayFinished(){
        System.out.println("\nFélicitations ! Vous avez trouvez une sortie !");
        System.out.println("Vous vous réveillez dans votre lit et réalisez que tout cela n'était qu'un rêve !!!");
    }

    /**
     * Displays an error message when the player goes off the board.
     *
     * @param e The OffSetPlayerException that was thrown
     */
    public void displayError(OffSetPlayerException e){
        System.out.println(e.getMessage());
    }

    /**
     * Asks the player if they want to play again.
     *
     * @return The player's response as a String
     */
    public String askToPlayAgain() {
        System.out.println("Voulez-vous jouer à nouveau ? (oui/non)");
        String answer = scanner.nextLine().toLowerCase();

        return answer;
    }

    /**
     * Checks if the player wants to exit the game.
     * If the input is "exit", displays a death message and terminates the program.
     *
     * @param input The user's input to check
     */
    public void checkExit(String input) {
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

    /**
     * Gets user input with a specified prompt message.
     *
     * @param message The prompt message to display
     * @return The user's input as a String
     */
    public String getInput(String message) {
        System.out.println(message);
        String input = scanner.nextLine();
        checkExit(input);
        return input;
    }

    /**
     * Allows the player to modify their character's attributes.
     * The player can change the name or type of their character.
     *
     * @param player The Player object to be modified
     */
    public void modify(Player player) {
        while (true) {
            System.out.println("\nQue voulez-vous modifier ?");
            System.out.println("1. Nom");
            System.out.println("2. Type");
            System.out.println("3. Terminer les modifications");

            String choix = getInput("Entrez votre choix (1, 2 ou 3) :");

            switch (choix) {
                case "1":
                    String nouveauNom = getInput("Entrez le nouveau nom :");
                    player.setName(nouveauNom);
                    System.out.println("Nom modifié avec succès.");
                    break;
                case "2":
                    String nouveauType = getInput("Entrez le nouveau type (Magicien ou Guerrier) :");
                    if (nouveauType.equalsIgnoreCase("Magicien")) {
                        player = new Wizard(player.getName());
                        System.out.println("Type modifié avec succès.");
                    }else if(nouveauType.equalsIgnoreCase("Guerrier")){
                        player = new Warrior(player.getName());
                        System.out.println("Type modifié avec succès.");
                    } else {
                        System.out.println("Type non valide. Le type n'a pas été modifié.");
                    }
                    break;
                case "3":
                    System.out.println("Modifications terminées.");
                    displayPlayer(player);
                    return;
                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
            }
        }
    }

    /**
     * Displays the current attributes of the player.
     *
     * @param player The Player object to be displayed
     */
    public void displayPlayer(Player player){
        System.out.println(player);
    }

    /**
     * Displays a message with a specified delay.
     * This method is used to create a more immersive experience by introducing pauses between messages.
     *
     * @param message The message to be displayed
     * @param delay The delay in milliseconds before the message is displayed
     */
    public void displayWithDelay(String message, int delay){
        try {
            Thread.sleep(delay);
            System.out.println(message);
        }catch (InterruptedException e) {
            System.err.println("Une interruption a eu lieu : " + e.getMessage());
        }
    }
}
