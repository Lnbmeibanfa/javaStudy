package com.lin.static_.staticMethod.single_;

public class SingleTon {

    public static void main(String[] args) {
        GirlFriend friend = GirlFriend.getGirlFriend();
        System.out.println(friend.toString());
    }
}

class GirlFriend {
    private final String name;

    private static final GirlFriend girlFriend = new GirlFriend("周思涵");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getGirlFriend() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name +
                '}';
    }
}
