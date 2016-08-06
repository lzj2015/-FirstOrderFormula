package com.lzj.entity;

/**
 * Created by lzj on 2016/8/6.
 */
public class Function {
    public String sentence = null;
    public String op = null;
    public Boolean result = null;

    public boolean hasOp() {
        return op != null;
    }

    public boolean hasResult() {
        return result != null;
    }
}
