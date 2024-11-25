package com.itheima.chapter8.sys;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        int choice;
        Scanner sc = new Scanner(System.in);
        String detail = "";
        double money;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do {
            System.out.println("----------零钱通菜单----------");
            System.out.println("\t\t\t1.零钱通明细         ");
            System.out.println("\t\t\t2.收益入账           ");
            System.out.println("\t\t\t3.消   费           ");
            System.out.println("\t\t\t4.退   出           ");
            System.out.println("请选择(1-4)");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n----------零钱通明细----------");
                    System.out.println(detail);
                    break;
                case 2:
                    System.out.print("请输入收益入账金额:");
                    money = sc.nextDouble();
                    while (money < 0) {
                        System.out.println("存储金额不得为0");
                        money = sc.nextDouble();
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t\t余额" + balance;
                    System.out.println("存入成功,您的余额为" + balance);
                    break;
                case 3:
                    System.out.println("请输入消费金额:");
                    money = sc.nextDouble();
                    balance -= money;
                    date = new Date();
                    detail += "\n消费  \t-" + money + "\t" + sdf.format(date) + "\t\t余额" + balance;
                    break;
                case 4:
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        } while (loop);


    }
}
