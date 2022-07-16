class Solution {
   
     public List<String> letterCombinationsRec(String p,String up){
       
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<String>();
		int d = up.charAt(0) - '0'; 
		int i = (d-2)*3;
		int len = i+3;
         if(d>7) {
			i=(d-2)*3 + 1;
			len++;
		}
		if(d==7 || d==9) {
			len = i+4;
		}
		
		for(;i<len;i++)
		{
//			ArrayList<String> list = new ArrayList<String>();
			char ch = (char)('a'+i);
			list.addAll(letterCombinationsRec(p+ch,up.substring(1)));
            // System.out.println(list);
			
		}
		
		return list;
	}
     
    
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<String>();
        return letterCombinationsRec("",digits);
    }
}