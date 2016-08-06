package com.lzj.entity;

/**
 * Created by lzj on 2016/8/2.
 */
public class Area {
    public String predicate;
    public String var;
    public boolean result;


    @Override
    public String toString() {
        return result ? "" : "~" + predicate + "(" + var + ") ";
    }

    public boolean compare(String predicate, String var) {
        return predicate.equals(this.predicate) && var.equals(this.var);
    }

}
