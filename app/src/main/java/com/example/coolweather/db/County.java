package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 陈勇劲 on 2017/7/26.
 */

public class County extends DataSupport {

    private int id;
    private String countryName;
    private String weathrId;
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeathrId() {
        return weathrId;
    }

    public void setWeathrId(String weathrId) {
        this.weathrId = weathrId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
