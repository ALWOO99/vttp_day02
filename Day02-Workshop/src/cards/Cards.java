package cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.Console;

public class Cards {

    static String[] Diamond = new String[13];
    static String[] Clubs = new String[13];
    static String[] Hearts = new String[13];
    static String[] Spades = new String[13];

    static int deckSize = Diamond.length + Clubs.length + Hearts.length + Spades.length;
    static String[] deck = new String[deckSize];

    static int diaClubSize = Diamond.length + Clubs.length;
    static String[] diaClub = new String[diaClubSize];

    static int heartSpadeSize = Hearts.length + Spades.length;
    static String[] heartSpade = new String[heartSpadeSize];

    public static void main(String[] args) {
        boolean stop = false;
        int flag = 0;
        deckInit();
        Console cons = System.console();

        while (!stop) {

            String cmd = cons.readLine("Shuffle? Y/N ").trim().toLowerCase();
            switch (cmd) {

                case "y":

                    toShuffle();
                    break;

                case "n":

                    stop = true;
                    break;

                default:

            }
        }

    }

    public static String[] deckInit() {

        for (int i = 0; i < Diamond.length; i++) {
            if (i < 9) {

                Diamond[i] = Integer.toString(i + 2);

            }
            if (i == 9) {
                Diamond[i] = "J";
            }

            if (i == 10) {
                Diamond[i] = "Q";
            }

            if (i == 11) {
                Diamond[i] = "K";
            }

            if (i == 12) {
                Diamond[i] = "A";
            }

            Diamond[i] += " Diamond";

            // System.out.printf("%s\n", Diamond[i]);

        }

        for (int i = 0; i < Clubs.length; i++) {
            if (i < 9) {

                Clubs[i] = Integer.toString(i + 2);

            }
            if (i == 9) {
                Clubs[i] = "J";
            }

            if (i == 10) {
                Clubs[i] = "Q";
            }

            if (i == 11) {
                Clubs[i] = "K";
            }

            if (i == 12) {
                Clubs[i] = "A";
            }

            Clubs[i] += " Clubs";

            // System.out.printf("%s\n", Clubs[i]);

        }

        for (int i = 0; i < Hearts.length; i++) {
            if (i < 9) {

                Hearts[i] = Integer.toString(i + 2);

            }
            if (i == 9) {
                Hearts[i] = "J";
            }

            if (i == 10) {
                Hearts[i] = "Q";
            }

            if (i == 11) {
                Hearts[i] = "K";
            }

            if (i == 12) {
                Hearts[i] = "A";
            }

            Hearts[i] += " Hearts";

            // System.out.printf("%s\n", Hearts[i]);

        }

        for (int i = 0; i < Spades.length; i++) {
            if (i < 9) {

                Spades[i] = Integer.toString(i + 2);

            }
            if (i == 9) {
                Spades[i] = "J";
            }

            if (i == 10) {
                Spades[i] = "Q";
            }

            if (i == 11) {
                Spades[i] = "K";
            }

            if (i == 12) {
                Spades[i] = "A";
            }

            Spades[i] += " Spades";

            // System.out.printf("%s\n", Spades[i]);

        }

        System.arraycopy(Diamond, 0, diaClub, 0, Diamond.length);
        System.arraycopy(Clubs, 0, diaClub, Diamond.length, Clubs.length);
        // System.out.println("\n\n\n\n\n\n"+Arrays.toString(diaClub));

        System.arraycopy(Hearts, 0, heartSpade, 0, Hearts.length);
        System.arraycopy(Spades, 0, heartSpade, Hearts.length, Spades.length);

        // System.out.println("\n\n\n\n\n\n"+Arrays.toString(heartSpade));

        System.arraycopy(diaClub, 0, deck, 0, diaClub.length);
        System.arraycopy(heartSpade, 0, deck, diaClub.length, heartSpade.length);

        // System.out.println("\n\n\n\n\n\n"+Arrays.toString(deck));

        System.out.printf("This is your current card %s\n", deck[0]);

        return deck;
    }

    public static void toShuffle() {

        List<String> deckList = Arrays.asList(deck);
        Collections.shuffle(deckList);

        System.out.printf("This is your new card %s\n", deck[0]);

    }
}