
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Solutions {


    public static long minTime(List<Integer> files, int numCores, int limit) {

        List<Integer> filenumCore = new ArrayList<>();
        List<Integer> OtherValues = new ArrayList<>();

        int value = 0;
        long time = 0L;


        for (int i = 0; i < files.size(); i++) {
            if (files.get(i) % numCores == 0) {
                filenumCore.add(files.get(i));

            } else {
                OtherValues.add(files.get(i));

            }


        }
        Collections.reverse(filenumCore);
        System.out.println(filenumCore);
        System.out.println(OtherValues);

        for (int i = 0; i < filenumCore.size(); i++) {
            if (i < limit) {
                time += filenumCore.get(i) / numCores;
            } else {
                time += filenumCore.get(i);
            }
        }

        for (int f : OtherValues) {
            time += f;
        }
        System.out.println(time);
        return time;

    }


}

public class ParallelProcessing {

    public static void main(String[] args) {

        List<Integer> files = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        int filesCount = myScanner.nextInt();

        for (int i = 0; i < filesCount; i++) {
            files.add(myScanner.nextInt());
        }

        int numCores = myScanner.nextInt();
        int limit = myScanner.nextInt();
        Solutions.minTime(files, numCores, limit);

    }
}













