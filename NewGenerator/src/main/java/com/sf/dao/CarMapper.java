package com.sf.dao;

import com.sf.model.Car;
import java.util.List;

public interface CarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String carID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int insert(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    Car selectByPrimaryKey(String carID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    List<Car> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Car record);
}