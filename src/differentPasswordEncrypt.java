import java.util.Scanner;

public class differentPasswordEncrypt {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();

        int m;
        char encryptedWord;
        // String finalword = "";


        String number = "";
        String numberOnly = word.replaceAll("[^1-9]", "");

        for (int k = numberOnly.length() - 1; k >= 0; k--) {
            {
                number = number + numberOnly.charAt(k);
                // continue;
            }


        }

        word = word.replaceAll("[1-9]", "");
        char[] charArray = word.toCharArray();

        for (m = 0; m < charArray.length; m++) {
            if (charArray[m] == '*') {
                //   char [] finalarray= finalword.toCharArray();
                encryptedWord = charArray[m - 1];
                charArray[m - 1] = charArray[m - 2];
                charArray[m - 2] = encryptedWord;


            }


        }
        System.out.println(charArray);

        String finalword = new String(charArray);
        //  finalword=charArray.toString();

        finalword = finalword.replaceAll("[*]", "");

        System.out.println(finalword);
//        if(charArray.length%2==0){
        // finalword = finalword + charArray[charArray.length - 1];
//        }
        //  for (int i=0;i<number.length();i++) {
        String value = "";
        //String numberValue = "";
        int i = 0;

        for (int j = 0; j < finalword.length(); j++) {
            if (finalword.charAt(j) == ('0')) {


                for (i = i; i < number.length(); i++) {
                    // numberValue = numberValue + number.charAt(i);
                    value = value + number.charAt(i);
                    break;
                }
                i++;

            } else {
                value = value + finalword.charAt(j);

            }

        }
        // }

        // }


        // System.out.println(finalword.toString());
        // System.out.println(word);

        System.out.println(value);


    }
}
