import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();

        String numberOnly= word.replaceAll("[^1-9]", "");

    //    word = word.replaceAll("[^a-zA-Z0-9_-]", "");

        word=word.replaceAll("[^A-Za-z0]", "");
        System.out.println(numberOnly);
        System.out.println(word);

    }
}
