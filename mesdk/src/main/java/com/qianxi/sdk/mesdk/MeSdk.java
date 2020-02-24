package com.qianxi.sdk.mesdk;

import java.security.MessageDigest;

public class MeSdk {

    private  static  MeSdk instance = null;

    public  MeSdk(){

    }

    public static MeSdk getInstance(){
        if(null==instance){
            instance = new MeSdk();
        }
        return instance;
    }

    public int getAdd(final int x,final int y){
        return x+y;
    }


}

