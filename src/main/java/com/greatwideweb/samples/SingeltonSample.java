package com.greatwideweb.samples;
public class SingeltonSample {
    public static void main(String[] args) {
        MySingelton singelton = MySingelton.INSTANCE;
        MySingelton singelton2 = MySingelton.INSTANCE;
        System.out.println(singelton2.getName());
        singelton.setName("Bob");
        System.out.println(singelton2.getName());
        System.out.println(singelton.getName());

    }
    enum MySingelton {
        INSTANCE;
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }
}
