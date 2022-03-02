import java.util.Locale;
import java.util.Scanner;

public class caesarCipher {

    void go() {
        intro();
        encrypt();
        decrypt();
        exit();
    }

    Scanner in = new Scanner(System.in);
    boolean yes = true;
    String alfabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

    String userinput1;
    char userinput2;

    void intro() {
        System.out.print("Encrypt type 1, Decrypt type 2 or exit to exit: ");
        userinput1 = in.nextLine();
    }

    void encrypt() {

        if (userinput1.equals("1")) {
            System.out.print("Write text you want encrypted: ");
            userinput1 = in.nextLine().toUpperCase(Locale.ROOT);
            for (int i = 0; i < alfabet.length(); i++) {
                char chinput = in.next().charAt(0);
                int indexOfChar = chinput;

            }
            // bliver encrypted
        }
    }

    void decrypt(){
            if (userinput1.equals("2")) {
                System.out.println("Write text you want decrypted: ");
                userinput1 = in.nextLine().toUpperCase();
                // bliver decrypted
            }
        }

        void exit () {
            userinput1.equals("exit");
            yes = false;
            //exit
        }




    public static void main (String[]args){
        new caesarCipher().go();
    }

    }










