class Solution {
    

	public static boolean isSafeString(char[][] b, int r,int c, int n) {
	
		for(int i =0;i<9;i++) {
			if(b[r][i] == Character.forDigit(n, 10) )
				return false;//looking in row
			
			if(b[i][c] == Character.forDigit(n, 10))
				return false; //looking in col
		}
		int rl = r - r%3;
		int cl = c - c%3;
		for(int i = rl;i<rl+3;i++)
		{
			for(int j = cl;j<cl+3;j++)
			{
				if(b[i][j]==Character.forDigit(n, 10))
					return false;
			}
				
		}
		return true;
	}
	
	public static boolean solveString(char[][] b) 
	{
		int r=-1,c=-1;
		boolean emptyleft = false;
		for(int i=0;i<b.length;i++)
		{
			for(int j = 0;j<b[i].length;j++) {
				if(b[i][j] == '.') {
					r=i;
					c=j;
					emptyleft = true;
					break;
				}
			}

			if(emptyleft)
				break;
		}
		if(!emptyleft) {
           
			return true;
		}
        
		for(int num =1;num<10;num++) {
			if(isSafeString(b,r,c,num)) {
					b[r][c] = Character.forDigit(num, 10);
				if(solveString(b)) {
					return true;
				}
				else {
					b[r][c] ='.';
				}
				
			}
			 // System.out.println(s);
		}
		
		
		return false;
	}
	

    
    public void solveSudoku(char[][] board) {
        if(solveString(board))
            return;
    }
}