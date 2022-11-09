package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _006_ContainerWithMostWater4 {
	public int maxArea(int[] height) {
		int lens = height.length;
		ArrayList<Integer> areaList = new ArrayList<>();
		
        for(int i=0;i<lens-1;i++) {
        	int countTemp=0;
        	int[] areaTempArray = new int[lens-i-1];
			for(int k=i+1;k<lens;k++) {
				switch(height[i]/height[k]) {
					case 0:						
						areaTempArray[countTemp]= height[i] * (k-i);
						countTemp++;
					case 1:
						if((k-i)> height[i]) {
							areaTempArray[countTemp]= height[k] * (k-i);
							countTemp++;
						}
				}				
			}
//			System.out.println(Arrays.toString(areaTempArray));
			Integer maxAreaTemp = Arrays.stream(areaTempArray).max().getAsInt();
			areaList.add(maxAreaTemp);
		}
        int maxArea = Collections.max(areaList);
		return maxArea;
    }
	public static void main(String[] args) {
		_006_ContainerWithMostWater t = new _006_ContainerWithMostWater();
		int [] tArray = {2,3,4,5,18,17,6};
		System.out.println(t.maxArea(tArray));
        //4913370
	}
}
