package Assignment2;

public class MonotonicArray {
	 public boolean isMonotonic(int[] nums) {
	        int length=nums.length;
	        if(length==1)return true;
	        boolean asc= true;
	        boolean desc=true;;
	       for(int i=0;i<nums.length-1;i++){
	            if(nums[i]>nums[i+1]){
	                asc=false;
	                break;
	            };
	        }
	        for(int i=0;i<length-1;i++){
	            if(nums[i]<nums[i+1]){
	                desc=false;
	                break;
	            }
	        }
	        
	        if(asc==true || desc==true)return true;
	        return false;
	    }
}
