import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws Exception {

        String document = br.readLine();
        String word = br.readLine();

        int count = 0;
        int index = 0;


        while ((index = document.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}