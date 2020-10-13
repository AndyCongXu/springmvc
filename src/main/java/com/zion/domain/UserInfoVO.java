package com.zion.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jianjiu.xc
 * @version : UserInfoVO, v 0.1 2020-10-13 11:02 jianjiu.xc Exp $
 */
public class UserInfoVO implements Serializable {

    private static final long serialVersionUID = -7636410858244460501L;

    private String name;

    private String age;

    private String sex;

    private SubUserInfo subUserInfo;

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */
    public String getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>sex</tt>.
     *
     * @return property value of sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param sex value to be assigned to property sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Getter method for property <tt>subUserInfo</tt>.
     *
     * @return property value of subUserInfo
     */
    public SubUserInfo getSubUserInfo() {
        return subUserInfo;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param subUserInfo value to be assigned to property subUserInfo
     */
    public void setSubUserInfo(SubUserInfo subUserInfo) {
        this.subUserInfo = subUserInfo;
    }

    @Override
    public String toString() {
        return "UserInfoVO{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", sex='" + sex + '\'' +
            ", subUserInfo=" + subUserInfo +
            '}';
    }
}
