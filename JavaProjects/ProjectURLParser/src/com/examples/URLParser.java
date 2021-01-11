package com.examples;

import com.exceptions.NotAValidFormat;

public class URLParser {

    public URLFormatObject parseURL(String url) throws NotAValidFormat {

//        url = "http://www.kubecloudsinc.com/autotools";
//		"http://24.106.206.2:10080/autotools";

        String[] urlSplits = url.split("/");
        String [] thirdPartSplits= null;

        if(urlSplits.length==4){
            thirdPartSplits= urlSplits[2].split("\\.");
            if(thirdPartSplits.length!=3 &&thirdPartSplits.length!=4){
                throw new NotAValidFormat();
            }
        }else{
            throw new NotAValidFormat();
        }

        URLFormatObject aFormatObject = new URLFormatObject();
        aFormatObject.setProtocol(urlSplits[0].split(":")[0]);
        aFormatObject.setPath(urlSplits[3]);

        if(thirdPartSplits.length==3){
            aFormatObject.setDomainName(urlSplits[2]);
        }
        if(thirdPartSplits.length==4){
//            String[] ipSplits = urlSplits[2].split(":");
            aFormatObject.setIpAddress(urlSplits[2].split(":")[0]);
            aFormatObject.setPortNumber(urlSplits[2].split(":")[1]);
        }
        aFormatObject.setUrl(url);
        return aFormatObject;


    }

}
