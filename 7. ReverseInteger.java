class Solution {
    public int reverse(int x) {
        int rev=0;
        boolean neg=x<0;
        x=Math.abs(x);
        while(x!=0){
            int dig=x%10;
            if (rev > (Integer.MAX_VALUE - dig) / 10) {
            return 0; 
        }

            rev=(rev*10)+dig;
            x/=10;
        }
        if(neg){
            return -rev;
        }
        else{
            return rev;
        }
        
    }
}
