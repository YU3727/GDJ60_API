package com.pooh.api2.collections;

import java.util.ArrayList;

public class ListMain3 {
//230109 Collection Framework - List : Generic <> 8교시
	public static void main(String[] args) {
		//Collection은 Type에 대해 안전하지 않음(꺼낼때 형변환을 해줘야 하니까)
		//Generic : Type의 안정성을 위한 장치
		//E : 변수명
		
		//E에는 Integer라는 값이 들어감.
		ArrayList<Integer> ar = new ArrayList<>(); //이 ArrayList는 Integer 타입만 들어간다는 보장이 생김.
		
		ar.add(1);
		
		int num = ar.get(0);
		
		//8교시
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO wdto = new WeatherDTO();
		wdto.setCity("Seoul");
		ar2.add(wdto);
		
		wdto = new WeatherDTO();
		wdto.setCity("Jeju");
		ar2.add(wdto);
		
		//이 주석처리를 지웠을 때는 Seoul, Jeju가 출력됨. 주석이 있을때는 Seoul이 출력됨. 그림그리면서 생각을 해보자
//		wdto = new WeatherDTO();
//		wdto.setCity("Jeju");
		
		ar2.remove(wdto); //wdto에는 주소가 들어가있는데, 주소가 같은애를 찾아가서 주소를 지우라는 뜻이다.
		
		for(int i=0; i<ar2.size(); i++) {
			System.out.println(ar2.get(i).getCity());
		} // ar2.get(i)는 wdto의 주소값이므로, 도시이름을 보고싶으면 wdto.getCity()를 했듯이 해야함
	}

}
