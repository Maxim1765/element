import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int arraySize = Integer.parseInt(bufferedReader.readLine());
        int[] mas = new int[arraySize];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(bufferedReader.readLine());
        }
        bufferedReader.close();
        fileReader.close();

        for (int i = 0; i < mas.length ; i++) {
            System.out.println(mas[i] + " ");
        }
        System.out.println();

        Arrays.sort(mas);

        FileWriter fileWriter = new FileWriter("input.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(Integer.toString(mas.length));
        bufferedWriter.newLine();

        for (int i = 0; i < mas.length; i++) {
            bufferedWriter.write(Integer.toString(mas[i]));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
