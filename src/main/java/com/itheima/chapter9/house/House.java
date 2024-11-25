package com.itheima.chapter9.house;

import com.itheima.chapter9.house.util.HouseStatus;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class House {
    int id;
    String name;
    String telephone;
    String address;
    double rent;
    HouseStatus status;

    public String showHouseInfo () {
        String showStatus = status == HouseStatus.RENTED ? "已出租" : "未出租";
        return id + "\t" + name + "\t" + telephone + "\t" + address + "\t" + rent + "\t" + showStatus;
    }

    public House(int id, String name, String telephone, String address, double rent, HouseStatus status) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    public House(String name, String telephone, String address, double rent, HouseStatus status) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    public HouseStatus getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setRent(double rent) {
        this.rent = rent;
    }
    public void setName(String name) {}
    public void setStatus(HouseStatus status) {
        this.status = status;
    }
}
