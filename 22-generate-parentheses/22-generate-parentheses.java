class Solution {
    
    	public static HashSet<String> BracketFun(String p , String up) {
		
		if(up=="") {
			HashSet<String> hs = new HashSet<>();
			hs.add(p);
			return hs;
		}
//		ArrayList<String> arrli = new ArrayList<String>();
		HashSet<String> set = new HashSet<>();
		for(int i= 0;i<p.length();i++) {
			String pass = p.substring(0, i+1) + "()"+ p.substring(i+1);
			set.addAll(BracketFun(pass,up.substring(2))); 
		}
		return set;
		
		
	}
	public static String prepareString(int n) {
		String res="";
		for(int i = 0;i<n-1;i++) {
			res += "()";
		}
		return res;
	}
    
    public List<String> generateParenthesis(int n) {
      // int n = 3;
		String str = prepareString(n);
//		ArrayList<String> li = new ArrayList<String>();
		ArrayList<String> arrli = new ArrayList<>(BracketFun("()",str));
		// System.out.println(arrli);
        return arrli;
    }
}