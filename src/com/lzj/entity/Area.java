package com.lzj.entity;

/**
 * Created by lzj on 2016/8/2.
 */
public class Area {
    public String predicate;
    public String var;
    public boolean result;
    public String not = "";

    public String op;

    @Override
    public String toString() {
        return not + predicate + "(" + var + ") " + (result ? "true" : "false");
    }

    public boolean compare(Area area) {
        return  predicate.equals(area.predicate);
    }

    public Area() {
    }

    public Area(Area area) {
        this.predicate = area.predicate;
        this.var = area.var;
        this.result = area.result;
        this.not = area.not;
        this.op = area.op;
    }
}
