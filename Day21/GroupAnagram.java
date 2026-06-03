import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class GroupAnagram {
    public ArrayList<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> groups = new HashMap<>();

        for (String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            // if (!groups.containsKey(key)){
            //     groups.put(key, new ArrayList<>());
            // }
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
        }

        ArrayList <List<String>> res = new ArrayList<>(groups.values());

        return res;        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0;i<n;i++){
            s[i] = sc.nextLine();
        }

        GroupAnagram o = new GroupAnagram();
        System.out.println(o.groupAnagrams(s));

        sc.close();
    }
}