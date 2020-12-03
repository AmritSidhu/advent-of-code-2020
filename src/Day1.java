import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        for(int i = 0; i < process().length; i++){
            for(int j = 1; j < process().length; j++){
                if( process()[i] + process()[j] == 2020){
                    sum = process()[i] * process()[j];
                }
            }
        }
        System.out.println(sum);
    }

    public static int[] process() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/input.txt"));
        int [] input = new int [200];
        int i = 0;
        while(scanner.hasNextInt())
        {
            input[i++] = scanner.nextInt();
        }
        return input;
    }
}
