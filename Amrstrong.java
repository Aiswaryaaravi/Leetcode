public static boolean amrstrong(int n){
	    int count=String.valueOf(n).length();
	    int am=0;
	    int temp=n;
	    while(n!=0){
	        int dig=n%10;
	        am+=Math.pow(dig,count);
	        n/=10;
	    }
	    if(am==temp){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
