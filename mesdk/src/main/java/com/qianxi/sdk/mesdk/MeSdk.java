package com.qianxi.sdk.mesdk;

public class MeSdk {

    private  static  MeSdk instance = new MeSdk();

    public  MeSdk getInstance(){
        return instance;
    }

    public int getAdd(final int x,final int y){
        return x+y;
    }


}

