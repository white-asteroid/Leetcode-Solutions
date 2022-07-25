class Solution {
    
    	public static HashSet<String> BracketFun(String p , String up) {
		
		if(up=="") {
			HashSet<String> hs = new HashSet<>();
			hs.add(p);
			return hs;
		}
		HashSet<String> set = new HashSet<>();
		HashSet<String> setr = new HashSet<>();
		
		for(int i= 0;i<p.length();i++) {
			String pass = p.substring(0, i+1) + "()"+ p.substring(i+1);
			setr = BracketFun(pass,up.substring(2));
			if(!set.containsAll(setr))
				set.addAll(setr); 
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
		String str = prepareString(n);
		ArrayList<String> arrli = new ArrayList<>(BracketFun("()",str));
        return arrli;
    }
}