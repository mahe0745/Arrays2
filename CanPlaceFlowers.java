package Assignment2;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int length = flowerbed.length;
        if(length>1){
            if(flowerbed[0]==0 & flowerbed[1]==0){
                count++;
                 flowerbed[0]=1;   
            }
            if(flowerbed[length-1]==0 & flowerbed[length-2]==0){
                flowerbed[length-1]=1;
                count++;}
        }
        if(length==1){
            if(flowerbed[0]==0)count++;
        }
        for( int i=1;i<length-1;i++){
            if((flowerbed[i]==0)&(flowerbed[i-1]==0)&flowerbed[i+1]==0){
                count++;
                flowerbed[i]=1;
            }
        }
        if(count>=n)return true;
        else return false;
   }
}
