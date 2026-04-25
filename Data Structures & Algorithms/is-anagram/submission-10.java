class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        //Sort
        // char[] sSort = s.toCharArray();
        // char[] tSort = t.toCharArray();

        // Arrays.sort(sSort);
        // Arrays.sort(tSort);

        // return Arrays.equals(sSort, tSort);

        // HashMap
        // Map<Character, Integer> countS = new HashMap<>();
        // Map<Character, Integer> countT = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
        //     countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // return countS.equals(countT);


        int [] refChars = new int[26];
        for(int i=0; i<s.length();i++){
            refChars[s.charAt(i)-'a']++;
            refChars[t.charAt(i)-'a']--;
        }
        for(int refChar : refChars){
            if(refChar != 0) return false;
        }
        return true;
    }
}
