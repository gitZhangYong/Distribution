package com.sf.model;

public class City {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityID
     *
     * @mbg.generated
     */
    private String cityID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinceID
     *
     * @mbg.generated
     */
    private String provinceID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityName
     *
     * @mbg.generated
     */
    private String cityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinceName
     *
     * @mbg.generated
     */
    private String provinceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityID
     *
     * @return the value of city.cityID
     *
     * @mbg.generated
     */
    public String getCityID() {
        return cityID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityID
     *
     * @param cityID the value for city.cityID
     *
     * @mbg.generated
     */
    public void setCityID(String cityID) {
        this.cityID = cityID == null ? null : cityID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.provinceID
     *
     * @return the value of city.provinceID
     *
     * @mbg.generated
     */
    public String getProvinceID() {
        return provinceID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.provinceID
     *
     * @param provinceID the value for city.provinceID
     *
     * @mbg.generated
     */
    public void setProvinceID(String provinceID) {
        this.provinceID = provinceID == null ? null : provinceID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityName
     *
     * @return the value of city.cityName
     *
     * @mbg.generated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityName
     *
     * @param cityName the value for city.cityName
     *
     * @mbg.generated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.provinceName
     *
     * @return the value of city.provinceName
     *
     * @mbg.generated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.provinceName
     *
     * @param provinceName the value for city.provinceName
     *
     * @mbg.generated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }
}