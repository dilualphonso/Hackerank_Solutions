import java.util.Arrays;
import java.util.Scanner;

public class PasswordEncrypt {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();


        char encryptedWord;
        String finalword = "";
        String number = "";
        String numberOnly = word.replaceAll("[^1-9]", "");

        for (int k = numberOnly.length() - 1; k >= 0; k--) {
            {
                number = number + numberOnly.charAt(k);
                // continue;
            }


        }

        word = word.replaceAll("[^A-Za-z0]", "");
        char[] charArray = word.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {

            for (int j = i + 1; j <= i + 1; j++) {
                if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                    if (charArray[j] >= 'a' && charArray[j] <= 'z') {
                        encryptedWord = charArray[i];
                        charArray[i] = charArray[j];
                        charArray[j] = encryptedWord;
                        finalword = finalword + charArray[i];
                        break;
                    } //else {
                    finalword = finalword + charArray[i];

                    //}
                } else {
                    finalword = finalword + charArray[i];
                }


                // else {

                //  finalword = finalword + charArray[i];
                // }


                //}

            }


        }

//        if(charArray.length%2==0){
        finalword = finalword + charArray[charArray.length - 1];
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


        System.out.println(finalword);
        // System.out.println(num);

        System.out.println(value);


    }
}

