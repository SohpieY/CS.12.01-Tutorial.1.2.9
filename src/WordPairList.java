import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;


    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();

        for(int i = 0; i < words.length - 1; i++){ //for the first word
            for(int j = i+1; j < words.length; j++){ //the second pairing
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }


    }

    public int numMatches()
    {

        int count = 0;

        for (WordPair pair : allPairs) {
            if (pair.getFirst().equals(pair.getSecond())) {
                count++;
            }
        }

        return count;
    }


    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }
}
