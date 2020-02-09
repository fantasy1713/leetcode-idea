public class LeetCode {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(1534236469));
    }
}

class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = x * -1;
        }
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        if (sb.length() == 1) {
            return x;
        }
        String reverseStr = sb.reverse().toString();
        int result  =0;
        try{
             result = Integer.valueOf(reverseStr);
        }catch(Exception e){
            result = 0;
        }
        if (result < 0) {
            return 0;
        } else {
            return result * sign;
        }
    }
}