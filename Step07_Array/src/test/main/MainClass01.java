package test.main;

public class MainClass01 {
	public static void main(String[] args) {

	//int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
	int[] nums={10, 20, 30, 40, 50};
	//double type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums2 라는 지역 변수에 담기
	double[] nums2={10.2, 10.3, 10.4, 10.5, 10.6};
	//boolean type  5개를 저장하고 있는 배열
	boolean[]isTrue={true,true,false,true,false};
	//String type 5개를 저장하고 있는 배열
	String[] han= {"가","나","다","라","마"};
	
	//배열  객체의 복제본 얻어내기
	int[] result=nums.clone();
	int[] result2=nums;//참조값 복사
	
	//배열의 크기 얻어내기
	int size=nums.length;
	
	//배열은 순서가 있는 데이터이다. 특정 index 의 item 참조하는 방법
	int first=nums[0];
	int second=nums[1];
	int third=nums[2];
	
}
}
