package com.abdelqodous.qa1z0_829.q43;

import java.io.Serializable;

public class Software implements Serializable {
    private String title;

    public Software(String title){
        this.title = title;
        System.out.print("Software ");
    }

    @Override
    public String toString() {
        return title;
    }
}
