import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "Science blank Maths blank blank Physics Physics PhySics physics blank Maths";
        countAndPrintRepeated(str);
    }

    public static void countAndPrintRepeated(String strContent) {
        Map<String, Integer> mapOfRepeatedWord = new HashMap<String,Integer>();
        String[] words = strContent.split(" ");
        for (String word : words) {
            String tempUCword = word.toLowerCase();
            if (mapOfRepeatedWord.containsKey(tempUCword)) {
                mapOfRepeatedWord.put(tempUCword, mapOfRepeatedWord.get(tempUCword)+1);
            }
            else{
                mapOfRepeatedWord.put(tempUCword, 1);
            }
        }
        System.out.println("Words\t\tCount");
        System.out.println("======\t\t=====");
        for (Map.Entry<String,Integer> entry : mapOfRepeatedWord.entrySet()) {
            System.out.println(entry.getKey()+ "\t\t"+entry.getValue());
        }
    }
}
