package 연습문제;

import lombok.Getter;
import lombok.Setter;

public class 텔레비전 {

	// 필드정의
	int channel;// 채널번호
	int volume; // 볼륨
	boolean onOff;// 전원
	String owner;// 주인
	String brand;// 브랜드
	int size;// 크기

	public void print텔레비전info() {
		System.out.println("tv info:" + this);
		System.out.println("tv channel" + channel);
		System.out.println("tv onOff:" + onOff);

	}

	// channel을 읽어라
	// 채널을 바꿔라 세팅 22번
	public void setChannel(int channel) {
		channel = 22;
	}

	// 채널을 준다
	public int getChannel() {
		return channel;
	}

	public static void main(String[] args) {
		// 텔레비전 객체를 만들어보자
		// 기본 자료형을 사용하듯이
		// 클래스(사용자 데이터 자료형) 객체변수명
		// =new 클래스명();
		// new : 메모리(램:주기억장치)에 방을 새로 만들어라
		// 클래스명(): 생성자라는 메소드로 하는
		// 역활은 데이터의 크기와 데이터의 종류를 알려준다.
		텔레비전 tv = new 텔레비전();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		tv.owner = "홍길동";
		tv.size = 65;
		tv.brand = "LG";

		텔레비전 tv2 = new 텔레비전();
		tv2.channel = 9;
		tv2.volume = 5;
		tv2.onOff = true;
		tv2.owner = "황진이";
		tv2.size = 70;
		tv2.brand = "kt";

		텔레비전 tv3 = new 텔레비전();
		tv3.channel = 11;
		tv3.volume = 2;
		tv3.onOff = true;
		tv3.owner = "나";
		tv3.size = 80;
		tv3.brand = "LG";
		// 객체의 상태 출력
		/// tv 정보 출력
		tv.print텔레비전info();
		System.out.println("==================");

		tv2.print텔레비전info();
		tv3.print텔레비전info();
		tv.print텔레비전info();

	}

	public static void print텔레비전info(텔레비전 tv) {
		System.out.println("tv객체 정보:" + tv);
		System.out.println("tv의 현재 상태:" + tv.onOff);
		System.out.println("음량:" + tv.volume);
		System.out.println("채널:" + tv.channel);
		System.out.println("주인" + tv.owner);
		System.out.println("크기" + tv.size);
		System.out.println("브랜드" + tv.brand);
		System.out.println("=============================");

//		System.out.println("tv의 현재 상태:" + tv.onOff + "\n" + "음량:" + tv.volume + "\n" + "채널:" + tv.channel + "\n" + "주인"
//				+ tv.owner + "\n" + "크기" + tv.size + "\n" + "브랜드" + tv.brand + "\n");

	}
}
//
//
//	public int getVolume() {
//		return volume;
//	}
//
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}
//
//
//	public boolean isOnOff() {
//		return onOff;
//	}
//
//
//	public void setOnOff(boolean onOff) {
//		this.onOff = onOff;
//	}
//
//
//	public String getOwner() {
//		return owner;
//	}
//
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//
//	public String getBrand() {
//		return brand;
//	}
//
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//
//	public int getSize() {
//		return size;
//	}
//
//
//	public void setSize(int size) {
//		this.size = size;
//	}
//}
