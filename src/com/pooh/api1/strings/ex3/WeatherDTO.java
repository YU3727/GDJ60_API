package com.pooh.api1.strings.ex3;

public class WeatherDTO {
//230106 3교시 API 예제
//230109 2교시 Library(API) 예제 wrapping(parseInt) - WeatherData, Input에 setTemp, setDust 고치기
	
	private String city;
	private int temp; //parseInt - String을 int로
	private String status;
	private int dust;
	//도시명, 기온, 상태, 미세먼지농도 값이 합쳐져야 DTO 하나가 완성됨
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDust() {
		return dust;
	}
	public void setDust(int dust) {
		this.dust = dust;
	}
	
}
