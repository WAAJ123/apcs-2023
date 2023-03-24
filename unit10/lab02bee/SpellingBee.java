import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.zip.CheckedInputStream;

public class SpellingBee {

    private char[] letters;
    private char mustUse;
     
    public boolean checkWord(String word) {
        if (word.length() < 4 || word.indexOf(mustUse) == -1) {
            return false;
        }

        char[] characters = word.toCharArray();
        String letWord = new String(letters);
        
        for (char character : characters) {
            if (letWord.indexOf(character) == -1) {
                return false;
            }
        }
        return true;
    }

    public SpellingBee(char[] letters, char mustUse) {
        this.letters = letters;
        this.mustUse = mustUse;
    }

    /**
     * Loads the contents of file "filename" as a String.
     * 
     * @param filename the file to load
     * @return the contents of file "filename"
     */
    public static String loadFile(String filename) {
        String contents = "";
        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());
            contents = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return contents;
    }

    public static void main(String[] args) {
        String[] words = loadFile("words_dropped.txt").split("\n");
        System.out.println("Loaded " + words.length + " words");

        SpellingBee bee = new SpellingBee("ranglty".toCharArray(), 'y');
        
        for(String word : words) {
            if (bee.checkWord(word)) {
                System.out.println(word);
            }
        }
  
        // Arrays.sort(words);
        // // linear search
        // int n = 0;
        // for (String word : words) {
        //     n++;
        //     if (word.equals("potato")) {
        //     //    System.out.println("found potato at " + n);
        //     }
        // }
        // String findMe = "potato";

        // int begin = 0;
        // int end = words.length - 1;
        // int guess = (begin + end) / 2;
        // int check = words[guess].compareTo(findMe);
        // System.out.println("word is " + words[guess]);
        // System.out.println("check is " + check);
        // while  (check != 0) {
        //     if (guess < 0) {
        //         begin = guess;
        //     }
        //     else if (check > 0) {
        //         end = guess;
        //     }
        //     guess = (begin + end) / 2;
        //     check = words[guess].compareTo(findMe);
        //     System.out.println("word is " + words[guess]);
        //     System.out.println("check is " + check);
        // }
        // begin = guess;

    }
}
