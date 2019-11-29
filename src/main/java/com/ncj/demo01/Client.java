package com.ncj.demo01;

import com.ncj.demo02.Host;

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
