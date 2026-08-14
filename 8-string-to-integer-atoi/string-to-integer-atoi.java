class Solution {
    private int solve(String s, int i, long num, int sign){
        //when we reach final number 
        if(i ==s.length())
  return (int)(num * sign);
        char ch = s.charAt(i);

        if(ch<'0' || ch>'9') //if we counter no digit (abc)
  return (int)(num * sign);
         num = num *10 +(ch-'0');//build number
            
              // Check overflow
        if (sign == 1 && num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (sign == -1 && num > 2147483648L)
            return Integer.MIN_VALUE;

        return solve(s,i+1,num, sign);
    }
    public int myAtoi(String s) {
        s = s.trim(); // remove white spaces

        if(s.length()==0)
        return 0;   

        int sign = 1;
        int i =0;

        if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        } else if(s.charAt(i)=='+'){
            i++;
        }
        return solve(s,i,0,sign);

    }
}