import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        for (int f = 0; f  < args.length; f++) {
            System.out.println(args[f]);
        }

        int[] arrFile1 = new int[10];
        FileReader readerFile1 = new FileReader("file1.txt");
        Scanner scan1 = new Scanner(readerFile1);
        int i = 0;
        while (scan1.hasNextLine()) {
            arrFile1[i] = scan1.nextInt();
            i++;
        }
        readerFile1.close();

        int[] arrFile2 = new int[10];
        FileReader readerFile2 = new FileReader("file2.txt");
        Scanner scan2 = new Scanner(readerFile2);
        i = 0;
        while (scan2.hasNextLine()) {
            arrFile2[i] = scan2.nextInt();
            i++;
        }
        readerFile2.close();

        int[] arrWrite = Sort.StartSortInt(arrFile1, arrFile2, arrFile1.length, arrFile2.length, true);

        FileWriter newRec = new FileWriter("sample.txt");
        for (int a = 0; a < arrWrite.length; a++) {
            newRec.write(arrWrite[a] + "\n");
        }
        newRec.close();
    }
}