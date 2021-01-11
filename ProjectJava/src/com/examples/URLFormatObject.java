package com.examples;

public class URLFormatObject {

    String url;
    String protocol;
    String domainName;
    String path;
    String ipAddress;
    String portNumber;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProtocol() {

        return protocol;
    }

    public void setProtocol(String protocol) {

        this.protocol = protocol;
    }

    public String getDomainName() {

        return domainName;
    }

    public void setDomainName(String domainName) {

        this.domainName = domainName;
    }

    public String getPath() {

        return path;
    }

    public void setPath(String path) {

        this.path = path;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {

        this.ipAddress = ipAddress;
    }

    public String getPortNumber() {

        return portNumber;
    }

    public void setPortNumber(String portNumber) {

        this.portNumber = portNumber;
    }

     public void showURLFormatObject(){
         System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
         System.out.println("The url you entered is:" + url);
         System.out.println("The parsed values of URL:::");
         if(getProtocol()!=null){
             System.out.println("The protocol is::: " + getProtocol());
         }
         if(getDomainName()!=null){
             System.out.println("The domainName is:::"+getDomainName());
         }
         if(getIpAddress()!=null){
             System.out.println("The IpAddress is:::"+ getIpAddress());
         }
         if(getPortNumber()!=null){
             System.out.println("The portNumber is:::"+getPortNumber());
         }
         if(getPath()!=null){
             System.out.println("The Path is:::"+getPath());
         }
         System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

     }

}
