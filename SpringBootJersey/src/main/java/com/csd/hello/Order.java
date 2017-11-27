package com.csd.hello;

import java.util.ArrayList;

public class Order {

    private Long id =null;
    private String place =null;
    private ArrayList dates =new  ArrayList();
    private  String state = null;

    public boolean isVaild()
    {
        if(place==null)
            return false;
        if(dates.isEmpty())
            return false;
        if(state==null)
            return false;
        if(id==null)
            return false;
        return true;
    }

}
