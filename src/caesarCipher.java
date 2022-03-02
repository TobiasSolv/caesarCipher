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



    void intro() {
        System.out.print("Encrypt type 1, Decrypt type 2 or exit to exit: ");
        userinput1 = in.nextLine();
    }

    void encrypt() {

        if (userinput1.equals("1")) {
            int numbers = 0;
            System.out.print("Write text you want encrypted: ");
            userinput1 = in.nextLine().toUpperCase(Locale.ROOT);
            for (int i = 0; i < 10; i++) {
                char chinput = in.next().charAt(0);
                int indexOfChar = alfabet.indexOf(chinput);
                numbers[i] = indexOfChar;
                System.out.println(numbers);


            }
            // bliver encrypted
        }
    }

    void decrypt() {
        if (userinput1.equals("2")) {
            System.out.println("Write text you want decrypted: ");
            userinput1 = in.nextLine().toUpperCase();
            for (int i = 0; i < 5; i++) {
                int intinput = in.nextInt();
                char inputLetter = alfabet(intinput);
                System.out.println(inputLetter);
                // bliver decrypted
            }
        }
    }

        void exit () {
        if (userinput1.equals("exit")){
            yes = false;
            //exit
        }

    }




    public static void main (String[]args){
        new caesarCipher().go();
    }

}










