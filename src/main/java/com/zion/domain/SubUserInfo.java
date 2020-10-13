package com.zion.domain;

import java.io.Serializable;

/**
 * @author jianjiu.xc
 * @version : SubUserInfo, v 0.1 2020-10-13 11:21 jianjiu.xc Exp $
 */
public class SubUserInfo implements Serializable {

    private String nick;

    private String staffId;

    /**
     * Getter method for property <tt>nick</tt>.
     *
     * @return property value of nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param nick value to be assigned to property nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * Getter method for property <tt>staffId</tt>.
     *
     * @return property value of staffId
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * Setter method for property <tt>counterType</tt>.
     *
     * @param staffId value to be assigned to property staffId
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "SubUserInfo{" +
            "nick='" + nick + '\'' +
            ", staffId='" + staffId + '\'' +
            '}';
    }
}
