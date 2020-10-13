package com.zion.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * @author jianjiu.xc
 * @version : SimpleDateConvert, v 0.1 2020-10-13 19:36 jianjiu.xc Exp $
 */
public class SimpleDateConvert implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if(null == s){
            return null;
        }

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.parse(s);
        } catch (Exception e){
            throw new RuntimeException("");
        }
    }
}
