package com.pooh.api2.token;

import java.util.StringTokenizer;

import com.pooh.api1.wrappers.ex1.NationDTO;

public class StringToken1 {
//230109 java.util Package 6교시
	public static void main(String[] args) {
		String nations = "Korea,Seoul,USA,Washington D.C.,UK,London,Japan,Tokyo";
		String [] n = nations.split(","); //한종류의 데이터. 즉 국가/수도 이런 식으로 한종류데이터만 자르면 split이 편함
		
		for(int i=0; i<n.length; i++) {
			NationDTO ndto = new NationDTO();
			ndto.setName(n[i]);
			ndto.setCity(n[++i]);
		}
		
		//2개를 합쳐야 하나의 데이터가 되니까 tokenizer가 편하다.
		StringTokenizer st = new StringTokenizer(nations, ",");
		while(st.hasMoreTokens()) { 
			NationDTO ndto = new NationDTO();
			//첫번째에 자른건 처음에
			String t1 = st.nextToken(); //자른곳에서부터 끝지점까지 찾음
			ndto.setName(t1);
			System.out.println(t1);	
			//두번째에 자른건 두번째에
			String t2 = st.nextToken();
			ndto.setCity(t2);
			System.out.println(t2);
		}
		
	}

}
