class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1 || n==2)
            return 0;
        if(n==3)
            return 1;
       
       boolean[] prime = new boolean[n+1];
		 int count = 0;
		 Arrays.fill(prime, true);
		 prime[0] = false;
		 prime[1] =false;
		 for(int i= 2;i <= Math.sqrt(n);i++) {
			
			 for(int j = i*2; j<prime.length;j+=i) {
				 prime[j] = false;
				 
			 }
		
		 }
		 for(int i = 1;i<prime.length-1;i++) {
				if(prime[i])
					{
						// System.out.println(prime[i]+" , "+i);
						count++;
					}
			}
		 return count;
	
    }
}