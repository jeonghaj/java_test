package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 0 으로 초기화된 방3개짜리 int[]	객체를 만들어서 참조값을 지역변수 nums 에 담기
		int[] nums= {0,0,0};
		// 0번방에 10, 2번방에 20, 20번방에 30을 저장하기
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		// 0 으로 초기화된 방 500개짜리 int[] 객체 만들어서 참조값을 지역변수 nums2 에 담기
		int[] nums2 = new int[500];
		/*
		 * 0번방에 1
		 * 1번방에 2
		 * .
		 * .
		 * .
		 * 499번방에 500을 저장해보세요.
		 */
		for(int i=0; i<nums2.length; i++) {
			nums2[i] = i+1;
			System.out.println(nums2[i]);
		}
		
	}
}
