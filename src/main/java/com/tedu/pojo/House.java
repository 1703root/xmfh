package com.tedu.pojo;

public class House  extends BaseEntity{
	private String houseId;
	private String userId;
	private String city;			//所在城市
	private String type;
	private Integer area;
	private Integer liveNum;
	private Integer roomNum;
	private Integer money;
	private String ask;
	private String address;
	private String tel;
	private String device;
	private String img1;
	private String img2;
	private String img3;
	private String img4;
	private String img5;
	private String img6;

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Integer getLiveNum() {
		return liveNum;
	}

	public void setLiveNum(Integer liveNum) {
		this.liveNum = liveNum;
	}

	public Integer getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getImg4() {
		return img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	public String getImg5() {
		return img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	public String getImg6() {
		return img6;
	}

	public void setImg6(String img6) {
		this.img6 = img6;
	}

	@Override
	public String toString() {
		return "House{" +
				"houseId='" + houseId + '\'' +
				", userId='" + userId + '\'' +
				", city='" + city + '\'' +
				", type='" + type + '\'' +
				", area=" + area +
				", liveNum=" + liveNum +
				", roomNum=" + roomNum +
				", money=" + money +
				", ask='" + ask + '\'' +
				", address='" + address + '\'' +
				", tel='" + tel + '\'' +
				", device='" + device + '\'' +
				", img1='" + img1 + '\'' +
				", img2='" + img2 + '\'' +
				", img3='" + img3 + '\'' +
				", img4='" + img4 + '\'' +
				", img5='" + img5 + '\'' +
				", img6='" + img6 + '\'' +
				'}';
	}
}
