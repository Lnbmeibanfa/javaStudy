package com.itheima.chapter9.house;

import com.itheima.chapter9.house.util.HouseStatus;

public class HouseService {
    House[] houses;
    int count;
    public HouseService() {
        houses = new House[100];
        count = 0;
    }

    public void addHouse (House house) {
        houses[count] = new House(count, house.name, house.telephone, house.address, house.rent, house.status);
        count++;
    }

    public void showHouses () {
        for (int i = 0;i < count;i++) {
            System.out.println(houses[i].showHouseInfo());
        }
    }

    public void findHouse (int id) {
        if (findHouseId(id) == -1) {
            return ;
        }
        System.out.println(houses[findHouseId(id)].showHouseInfo());
    }

    public int findHouseId (int id) {
        for (int i = 0;i < count;i++) {
            if (houses[i].id == id) {
                return i;
            }
        }
        return -1;
    }

    public void delHouse(int id) {
        if (findHouseId(id) == -1) {
            return ;
        }
        if (count == 1) {
            count--;
            houses[0] = null;
        } else {
            for (int i = findHouseId(id);i < count;i++) {
                houses[i] = houses[i+1];
            }
            houses[count-1] = null;
            count--;
        }

    }
    public void updateHouse (int id, House house) {
        if (findHouseId(id) == -1) {
            return ;
        }
        int index = findHouseId(id);
        houses[index].setName(house.name);
        houses[index].setTelephone(house.telephone);
        houses[index].setAddress(house.address);
        houses[index].setRent(house.rent);
        houses[index].setStatus(house.status);
    }
}
