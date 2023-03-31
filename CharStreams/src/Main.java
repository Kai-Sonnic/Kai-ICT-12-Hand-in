import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        ArrayList<String> sentences = main.readSentences("ProgrammingHistory.txt");
        ArrayList<int[]> matches = main.search("However", sentences);
        for (int i = 0; i < matches.size(); i++) {
            int[] match = matches.get(i);
            System.out.println(match[0] + ", " + match[1]);
        }

    }
    //Reads the file and copies each sentence to an ArrayList
    public ArrayList<String> readSentences(String fileName) throws IOException {
        ArrayList<String> sentences;
        sentences = new ArrayList<>();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split("\\.[\\[0-9\\]]*[ ]");
            for (String part: parts) {
                if (part.length() != 0) {
                    if (part.charAt(part.length()-1) != '.') {
                        sentences.add(part + ".");
                    } else {
                        sentences.add(part);
                    }
                }
            }
        }
        return sentences;
    }

    public ArrayList<int[]> search(String string, ArrayList<String> list) {
        ArrayList<int[]> matches = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String currString = list.get(i);
            int index = currString.indexOf(string);
            if (index != -1) {
                matches.add(new int[]{i, index});
            }
        }

        return matches;
    }
}

