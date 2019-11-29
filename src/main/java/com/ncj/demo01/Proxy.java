package com.ncj.demo01;

import com.ncj.demo02.Host;
import com.ncj.demo02.Rent;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        lookHouse();
        host.rent();
        sign();
    }

    public void lookHouse(){
        System.out.println("中介带客户看房！");
    }

    public void sign(){
        System.out.println("中介带客户签合同");
    }
}
