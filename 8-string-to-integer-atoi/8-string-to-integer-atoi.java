class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty())
            return 0;
         int i = 0,m=1,res=0,prev=0;
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i<s.length() && s.charAt(i)== '-') {
            m = -1;
            i++;
        }
        else if (i<s.length() && s.charAt(i)== '+') {
//            m= 1;
            i++;
        }

        //first digit
        if(i<s.length() && (s.charAt(i)<'0' || s.charAt(i) > '9'))
            return 0;
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        int t ,c =0;
        boolean f =false;
        if(i<s.length() && i<s.length())
            prev = s.charAt(i) - '0';
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i) <= '9'){

            t =s.charAt(i) -'0';
          

            System.out.println(res+ "t : "+t);
            System.out.print("Condition : ");
            System.out.println((res >  Integer.MAX_VALUE / 10 || (res ==  Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)));
            if(res >  Integer.MAX_VALUE/10  || (res ==  Integer.MAX_VALUE/10 && s.charAt(i) - '0' > 7))
            {
                res =0;
                f = true;
                break;
            }
            i++;
            c++;
            prev = res;
            res*=10;
              res += t;
            if(i== s.length())
                break;
            
        }
        if(f)
        {
            if(m==1)
                return 2147483647;
            else if (m== -1) {
                return -2147483648;
            }
        }


        return res*m;
    }
}
