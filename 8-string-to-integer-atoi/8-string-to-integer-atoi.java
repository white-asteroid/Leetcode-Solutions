class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty())  // see if string is empty
            return 0;
         int i = 0,m=1,res=0,prev=0;
        while(i<s.length() && s.charAt(i) == ' '){  
            i++; //ignore all the white spaces
        }
        if(i<s.length() && s.charAt(i)== '-') {  //check if there is any sign 
            m = -1;
            i++;
        }
        else if (i<s.length() && s.charAt(i)== '+') {
            i++;
        }                                          //sign check end

        //first digit
        if(i<s.length() && (s.charAt(i)<'0' || s.charAt(i) > '9')) // first digit cant be other than numbers i.e if first character is a letter return 0
            return 0;
        while(i<s.length() && s.charAt(i)=='0'){ // check if first digit is zero
            i++;
        }
        int t ,c =0;
        boolean f =false;
        if(i<s.length())   // MAIN STUFF
            
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i) <= '9'){
        // this while condition will check if string contains only numbers
            t =s.charAt(i) -'0'; // this converts char to int
            //INT_MAX = 2147483648
            if(res >  Integer.MAX_VALUE/10  || (res ==  Integer.MAX_VALUE/10 && s.charAt(i) - '0' > 7)) //if result is greater than 214748364 than string can have number greater than MAX_INT so check if last digit is also grt than 7 (Read description if your confused)
            {
                res =0;
                f = true;
                break;
            }
            i++;
            c++;
            res*=10;
            res += t;
            if(i== s.length()) // just extra checking
                break;
            
        }
        if(f)             // if string s is not in range
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
