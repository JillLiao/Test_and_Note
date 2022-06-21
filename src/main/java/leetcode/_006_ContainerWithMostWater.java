package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class _006_ContainerWithMostWater {
	public int maxArea(int[] height) {
        int maxValue = Arrays.stream(height).max().getAsInt();
        List<Integer> indexMax = new ArrayList<>();
        int lens=height.length;
        for(int i=0;i<lens;i++) {
        	if(height[i] == maxValue) {
        		indexMax.add(i);
        	}
        }
        List<Integer> area = new ArrayList<>();
        ListIterator<Integer> iter = indexMax.listIterator();
        for(int k=0;k<lens;k++) {
        	while (iter.hasNext()) {
				area.add(height[k] * Math.abs(k-iter.next()));
			}
        	iter = indexMax.listIterator();
        }
        int maxArea = area.stream().mapToInt(x -> x).max().getAsInt();
		
		return maxArea;
    }
	public static void main(String[] args) {
		_006_ContainerWithMostWater t = new _006_ContainerWithMostWater();
		int [] tArray = {1,8,6,2,5,4,8,3,7};
		System.out.println(t.maxArea(tArray));
        
	}
}
