import java.util.*;

class MaxWordCount {
    public int mostWordsFound(String[] sentences) {
        int len = sentences.length;
        int [] word_len = new int[len];

        for (int i = 0; i < len; i++){
            String sen = sentences[i];

            String[] words = sen.split(" ");
            word_len[i] = words.length;
        }

        int max = word_len[0];
        for (int j = 0; j < len; j++){
            if (word_len[j] > max){
                max = word_len[j];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String [] sentences = new String[n];

        for (int i = 0; i < n; i++){
            sentences[i] = sc.nextLine();
        }

        MaxWordCount obj = new MaxWordCount();
        int result = obj.mostWordsFound(sentences);

        System.out.println(result);
        sc.close();
    }
}