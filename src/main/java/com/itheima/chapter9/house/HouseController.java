package com.itheima.chapter9.house;

import com.itheima.chapter9.house.util.HouseStatus;

import java.util.Scanner;

public class HouseController {
    int choice;
    Scanner sc;
    HouseService houseService;
    public HouseController() {
        houseService = new HouseService();
        sc = new Scanner(System.in);
    }
    public int getChoice () {
        System.out.println("--------------------房屋出租系统--------------------");
        System.out.println("\t\t\t\t\t1.新 增 房 源\t\t\t\t");
        System.out.println("\t\t\t\t\t2.查 找 房 屋\t\t\t\t");
        System.out.println("\t\t\t\t\t3.删 除 房 屋\t\t\t\t");
        System.out.println("\t\t\t\t\t4.修 改 房 屋 信 息\t\t\t\t");
        System.out.println("\t\t\t\t\t5.房 屋 列 表\t\t\t\t");
        System.out.println("\t\t\t\t\t6.退      出\t\t\t\t");
        System.out.println("\t\t\t\t\t输入1-6进行操作\t\t\t\t");
        choice = sc.nextInt();
        return choice;
    }
    public void addHouse () {
        System.out.println("--------------------添加房屋--------------------");
        houseService.addHouse(getAddHouse());
    }
    public void updateHouse () {
        System.out.println("--------------------添加房屋--------------------");
        System.out.print("请输入要修改的房屋id");
        int id = sc.nextInt();
        System.out.println("请输入修改信息:");
        houseService.updateHouse(id, getAddHouse());
    }
    public House getAddHouse () {
        System.out.print("姓名:");
        String name = sc.next();
        System.out.print("电话:");
        String tel = sc.next();
        System.out.print("地址:");
        String address = sc.next();
        System.out.print("月租:");
        double rent = sc.nextDouble();
        System.out.print("状态:(1已出租/0未出租)");
        HouseStatus status = sc.nextInt() == 0 ? HouseStatus.UNRENTED : HouseStatus.RENTED;
        return new House(name, tel, address, rent, status);
    }
    public void showHouses () {
        System.out.println("----------------------------------------房屋列表----------------------------------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        houseService.showHouses();
    }
    public void findHouse () {
        System.out.println("----------------------------------------查找房屋----------------------------------------");
        System.out.println("请输入房屋编号");
        int id = sc.nextInt();
        houseService.findHouse(id);
    }
    public void delHouse () {
        System.out.println("----------------------------------------查找房屋----------------------------------------");
        System.out.println("请输入删除房屋编号");
        int id = sc.nextInt();
        System.out.println("是否删除房屋,请谨慎选择(y/n)");
        if (sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
            houseService.delHouse(id);
        }
    }
    public void mainProcess () {
        boolean loop = true;
        do {
            choice = getChoice();
            switch (choice) {
                case 1:
                    addHouse();
                    break;
                case 2:
                    findHouse();
                    break;
                case 3:
                    delHouse();
                    break;
                case 4:
                    updateHouse();
                    break;
                case 5:
                    showHouses();
                    break;
                case 6:
                    System.out.println("确定要退出系统吗(y/n)");
                    loop = !(sc.next().charAt(0) == 'y');
                    break;
            }
        } while (loop);
    }
}
