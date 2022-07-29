class Solution {
   public boolean valid(String word , String pattern){
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for (int i = 0; i <pattern.length() ; i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if(!map1.containsKey(w)){
                map1.put(w,p);

            }
            if(!map2.containsKey(p)) {
                map2.put(p, w);
            }
            if(map1.get(w)!=p || map2.get(p)!=w){
                return false;
            }
        }

        // System.out.println(map1.toString()+" , " +map2.toString());



        return true;



        }
    public List<String> findAndReplacePattern(String[] words, String p) {
        ArrayList<String> arrli = new ArrayList<>();
        for(String w : words)
        {
            if(valid(w,p))
            {
                arrli.add(w);
            }
        }

        return arrli;
    }
}