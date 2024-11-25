package com.itheima.chapter8.sysOOP;

import java.time.LocalDateTime;

public class SysInfo {
    private String info;
    OperaType operaType;
    private double operaMoney;
    LocalDateTime time;
    static double balance;

    /**
     * 构造函数
     * @param info 操作描述
     * @param operaType 操作的
     * @param operaMoney 操作的钱款数量
     * @param balance 当前余额
     */
    public SysInfo(String info, OperaType operaType, double operaMoney, LocalDateTime time, double balance) {
        this.info = info;
        this.operaType = operaType;
        this.operaMoney = operaMoney;
        this.time = time;
        this.balance = balance;
    }

    public String getInfo() {
        return info;
    }
    public OperaType getOperaTypeType() {
        return this.operaType;
    }
    public double getOperaMoney() {
        return operaMoney;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public double getBalance() {
        return balance;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void setOperaType(OperaType operaType) {
        this.operaType = operaType;
    }
    public void setOperaMoney(double operaMoney) {
        this.operaMoney = operaMoney;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    /**
     * 对存款进行操作
     * @param money 操作的数量
     */
    public void operateBalance (double money) {
        if (balance + money < 0) {
            System.out.println("你的余额不足");
            return;
        }
        balance += money;
    }
}
