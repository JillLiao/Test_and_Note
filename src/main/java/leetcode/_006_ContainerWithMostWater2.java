package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _006_ContainerWithMostWater2 {
	public int maxArea(int[] height) {
                
        List<Integer> areaList = new ArrayList<>();
		
        for(int i=0, lens = height.length;i<lens-1;i++) {
			for(int k=i+1;k<lens;k++) {
				areaList.add(Math.min(height[i], height[k]) * (k-i));	
			}
		}
        Integer maxArea = areaList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		return maxArea;
    }
	
	
	public static void main(String[] args) {
//		_006_ContainerWithMostWater2 t = new _006_ContainerWithMostWater2();
		int [] tArray = {};
//		System.out.println(t.maxArea(tArray));
		
		int lens = tArray.length;    
        
        List<Integer> areaList = new ArrayList<>();
		
        for(int i=0;i<lens-1;i++) {
			for(int k=i+1;k<lens;k++) {
				areaList.add(Math.min(tArray[i], tArray[k]) * (k-i));	
			}
		}
        Integer maxArea = areaList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        
//        System.out.println("lens ="+lens);
//        System.out.println("areaLens ="+tArray);
        System.out.println(maxArea);
	}
	
}
