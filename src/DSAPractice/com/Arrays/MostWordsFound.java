package DSAPractice.com.Arrays;

public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much","Hi"};
        int result = getMostWords(sentences);
        System.out.println(result);
    }
    private static int getMostWords(String[] sentences) {
        int[] sum = new int[Integer.parseInt(sentences[0])];
        int max = 0;
        System.out.println(sentences.length);
        /*for(int i =0;i<sentences.length;i++){

            String[] arr = sentences[i].split(" ");
            if(arr.length>max){
                max = arr.length;
            }
        }*/
        for(String eachSentence : sentences){
           int currSentenceLen = eachSentence.split(" ").length;
           if(currSentenceLen>max){
               max = currSentenceLen;
           }
        }
        return max;
    }
}

