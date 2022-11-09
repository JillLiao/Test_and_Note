package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class _006_ContainerWithMostWater3 extends RecursiveTask<Integer>{
	private static final long THRESHOLD = 20;
	private int maxArea;
	private int [] height;
	
	public _006_ContainerWithMostWater3(int[] height) {
		super();
		this.height = height;
	}	
	
	public int maxArea(int[] height) {
        int lens = height.length;    
                
        List<Integer> areaList = new ArrayList<>();
		
        for(int i=0;i<lens-1;i++) {
			for(int k=i+1;k<lens;k++) {
				areaList.add(Math.min(height[i], height[k]) * (k-i));	
			}
		}
        Integer maxArea = areaList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		return maxArea;
    }
	@Override
	protected Integer compute() {
		int lens = height.length;
		
		
		return null;
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
        
        System.out.println("lens ="+lens);
//        System.out.println("areaLens ="+Arrays.toString(tArray));
        System.out.println(maxArea);
	}
	
}
