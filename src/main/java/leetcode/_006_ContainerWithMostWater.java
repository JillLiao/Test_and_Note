package leetcode;

import java.util.Arrays;

public class _006_ContainerWithMostWater {
	public int maxArea(int[] height) {
		int lens = height.length;
		int[] areaArray = new int[lens-1];
		
		int areaCount=0;
        for(int i=0;i<lens-1;i++) {
        	int countTemp=0;
        	int[] areaTempArray = new int[lens-i-1];
			for(int k=i+1;k<lens;k++) {
				switch(height[i]/height[k]) {
					case 0:
						areaTempArray[countTemp]= Math.min(height[i], height[k]) * (k-i);
						countTemp++;
					case 1:	
				}				
			}
			System.out.println(Arrays.toString(areaTempArray));
			Integer maxAreaTemp = Arrays.stream(areaTempArray).max().getAsInt();
			areaArray[areaCount] = maxAreaTemp;
			areaCount++;
		}
        System.out.println(Arrays.toString(areaArray));
        Integer maxArea = Arrays.stream(areaArray).max().getAsInt();
		return maxArea;
    }
	public static void main(String[] args) {
		_006_ContainerWithMostWater t = new _006_ContainerWithMostWater();
		int [] tArray = {2,3,4,5,18,17,6};
		System.out.println(t.maxArea(tArray));
        //4913370
	}
}
