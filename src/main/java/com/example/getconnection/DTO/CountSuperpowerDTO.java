package com.example.getconnection.DTO;

public class CountSuperpowerDTO {
    private String heroName;
    private String realName;
    private int count;

    public CountSuperpowerDTO(String heroName, String realName, int count) {
        this.heroName = heroName;
        this.realName = realName;
        this.count = count;
    }


    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCount() {
        return count;
    }
}
