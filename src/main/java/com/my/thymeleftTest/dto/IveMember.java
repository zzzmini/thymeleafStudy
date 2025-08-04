package com.my.thymeleftTest.dto;

public class IveMember {
    private String memberName;
    private int age;
    private String address;

    public IveMember(){}

    public IveMember(String memberName, int age, String address) {
        this.memberName = memberName;
        this.age = age;
        this.address = address;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
