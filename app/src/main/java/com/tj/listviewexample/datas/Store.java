package com.tj.listviewexample.datas;
//가게가 갖고있는 고유 정보 저장
public class Store {

   public String name;
//    거리 : 가게의 좌표와 나의 좌표를 비교해서 계산!
//    위도 / 경도 => 27.123, 123.014
//    double latitude;
//    double longitude;

    public String address;
    public String openTime;
    public String closeTime;

    //alt + insert, Constructor
    public Store(String name, String address, String openTime, String closeTime) {
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
