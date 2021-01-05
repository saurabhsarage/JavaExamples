import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileWordCount {
    public static void main(String[] args) {
        countReapeatedCharacter("words.txt");
    }
    public static void  countReapeatedCharacter(String filename){
        String line = "";
        Map<String, Integer> mapOfrepeatedWords = new HashMap<String, Integer>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            while ((line = bufferedReader.readLine())!=null) {
                String[] chArray = line.split(" ");
                for (String temp : chArray) {
                    String ch = temp.toLowerCase();
                    if (ch != null) {
                        if (mapOfrepeatedWords.containsKey(ch)) {
                            mapOfrepeatedWords.put(ch, mapOfrepeatedWords.get(ch)+1);
                        }
                        else{
                            mapOfrepeatedWords.put(ch, 1);
                        }
                    }
                }
            }
            System.out.println("Char\t\tCount");
            System.out.println("====\t\t====");
            Set<String> character = mapOfrepeatedWords.keySet();
            for (String ch : character) {
                System.out.println(ch+"\t\t"+mapOfrepeatedWords.get(ch));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
