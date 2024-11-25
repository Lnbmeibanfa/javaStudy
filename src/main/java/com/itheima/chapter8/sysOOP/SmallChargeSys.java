package com.itheima.chapter8.sysOOP;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class SmallChargeSys {
    // 零钱通最多可以存10条记录
    private String detail;
    private double balance;
    private Scanner sc;
    private Date date;
    private SimpleDateFormat sdf;
    public SmallChargeSys () {
        this.sc = new Scanner(System.in);
        this.detail = "";
        this.balance = 0.0;
        sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    }

    public int getChoice () {
        System.out.println("----------零钱通菜单----------");
        System.out.println("         1.零钱通明细         ");
        System.out.println("         2.收益入账           ");
        System.out.println("         3.消   费           ");
        System.out.println("         4.退   出           ");
        System.out.println("请选择(1-4)");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice < 0 || choice > 4) {
            System.out.println("功能暂未开通,请重新选择");
            return getChoice();
        }
        return choice;
    }

    public boolean execute (int choice) {
        double money;
        switch (choice) {
            case 1:
                showDetail();
                break;
            case 2:
                System.out.println("请输入存入金额:");
                money = sc.nextDouble();
                if (money < 0) {
                    System.out.println("存入金额不得为负数");
                    break;
                }
                saveMoney(money);
                break;
            case 3:
                System.out.println("请输入要取出的金额,输入0取消,金额不得为负数,取出金额不得大于余额");
                money = sc.nextDouble();
                if (money < 0) {
                    System.out.println("取出金额不得为负数");
                    break;
                } else if (money > balance) {
                    System.out.println("您当前余额不足");
                    break;
                }
                drawMoney(money);
                break;
            case 4:
                return false;
        }
        return true;
    }

    private void showDetail () {
        System.out.println("\n----------零钱通明细----------");
        System.out.println(detail);
    }

    private void saveMoney (double money) {
        if (money < 0) {
            return;
        }
        this.balance += money;
        date = new Date();
        detail += "入账\t+" + money + "\t" + sdf.format(date) + "\t\t余额" + balance + "\n";
        System.out.println("存入成功,您的余额为" + balance);
    }
    private void drawMoney (double money) {
        if (money < 0 && money > balance) {
            return;
        }
        this.balance -= money;
        date = new Date();
        detail += "消费\t-" + money + "\t" + sdf.format(date) + "\t\t余额" + balance + "\n";
    }
}
