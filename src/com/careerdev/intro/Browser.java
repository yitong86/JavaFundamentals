package com.careerdev.intro;

public class Browser {
    public static void main(String[] args) {
        var browser = new Browser();


    }
    public  void navigate(String address) {
        String ip = findIpAddress("...",true);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }
    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }
}
