import java.util.Locale;
import java.util.Scanner;

public class caesarCipher {

    void go() {
        intro();

    }


    void intro() {
        Scanner in = new Scanner(System.in);
        boolean yes = true;
        String alfabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

        String userinput1;

        System.out.print("Encrypt type 1 or Decrypt type 2: ");
        userinput1 = in.nextLine();

        if (userinput1.equals("1")) {
            System.out.print("Write text you want encrypted: ");
            userinput1 = in.nextLine().toUpperCase(Locale.ROOT);
            // bliver encrypted

        } else if (userinput1.equals("2")) {
            System.out.println("Write text you want decrypted: ");
            userinput1 = in.nextLine().toUpperCase();
            // bliver decrypted

        } else {
            userinput1.equals("exit");
            yes = false;
            //exit
        }


    }


    public static void main(String[] args) {
        new caesarCipher().go();
    }

}
