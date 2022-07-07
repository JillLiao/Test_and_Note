package leetcode;

import java.util.Arrays;

public class _006_ContainerWithMostWater {
	public int maxArea(int[] height) {
		int lens = height.length;
		int[] areaArray = new int[(lens*(lens-1))/2];
		
		int count=0;
        for(int i=0;i<lens-1;i++) {
			for(int k=i+1;k<lens;k++) {
				areaArray[count]= Math.min(height[i], height[k]) * (k-i);
				count++;
			}
		}
        Integer maxArea = Arrays.stream(areaArray).max().getAsInt();
		return maxArea;
    }
	public static void main(String[] args) {
		_006_ContainerWithMostWater t = new _006_ContainerWithMostWater();
		int [] tArray = {};
		System.out.println(t.maxArea(tArray));
        //4913370
	}
}
