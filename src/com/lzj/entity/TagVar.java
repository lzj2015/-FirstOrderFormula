package com.lzj.entity;

/**
 * Created by lzj on 2016/8/3.
 */
public class TagVar {
    public boolean flag;
public int linePosition;
    public String varStr;

    public TagVar(boolean flag, String varStr,int linePosition) {
        this.flag = flag;
        this.varStr = varStr;
        this.linePosition = linePosition;
    }

    public TagVar() {
    }

    @Override
    public String toString() {
        return varStr + " " + flag;
    }
}
