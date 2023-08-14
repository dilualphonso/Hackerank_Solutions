import java.util.Scanner;

public class VowelSubString {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        String string = myScanner.next();
        int k = myScanner.nextInt();
        Solutionvowel.finalsubstring(string, k);
    }


}

class Solutionvowel {

    public static String finalsubstring(String s, int k) {
        String substringword = "";
        int VowelCount = 0;
        int MaxCount = 0;
        String substringfinal = "";
        for (int i = 0; i < s.length() - k; i++) {

            substringword = s.substring(i, i + k);
            for (int j = 0; j < substringword.length(); j++) {
                if (substringword.toLowerCase().charAt(j) == 'a' || substringword.charAt(j) == 'e' || substringword.charAt(j) == 'i' || substringword.charAt(j) == 'o' || substringword.charAt(j) == 'u') {
                    VowelCount++;
                }

            }
            // if (VowelCount==0){
            //System.out.println("Not found");

            // }
            if (MaxCount < VowelCount) {
                MaxCount = VowelCount;
                substringfinal = substringword;
            } else {
                substringfinal = substringfinal;
            }
            VowelCount = 0;


            //System.out.println(substringword);

        }
        if (MaxCount == 0) {
            System.out.println("Not found");

        }

        System.out.println(substringfinal);


        return substringfinal;

    }

}


