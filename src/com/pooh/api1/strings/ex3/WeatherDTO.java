package com.pooh.api1.strings.ex3;

public class WeatherDTO {
//230106 3교시 API 예제
	
	private String city;
	private String temp;
	private String status;
	private String dust;
	//도시명, 기온, 상태, 미세먼지농도 값이 합쳐져야 DTO 하나가 완성됨
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDust() {
		return dust;
	}
	public void setDust(String dust) {
		this.dust = dust;
	}
	
}
