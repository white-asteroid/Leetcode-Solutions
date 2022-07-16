class Solution {
   
     public List<String> letterCombinationsRec(String p,String up){
       
		if(up == "") { 
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<String>();
		int d = up.charAt(0) - '0'; //cpnvert string to numeric value 
		int i = (d-2)*3;    // Calculating the character we need to start with
                            //for ex if we have "4" we need to start from ('a'+ i)ASCII
		int len = i+3;
         if(d>7) {
			i=(d-2)*3 + 1;
			len++;          // cause we are changing va;ue of 1 you can change this to l =i+3
		}
		if(d==7 || d==9) {
			len = i+4;    // for 7 and 9 we have for letters
		}
		
		for(;i<len;i++)  // run the loop according to number of letters in that key 
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