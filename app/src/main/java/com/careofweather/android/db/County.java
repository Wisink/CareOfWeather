package com.careofweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Amao on 2017/9/28.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int countyId) {
        this.cityId = countyId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }
}
