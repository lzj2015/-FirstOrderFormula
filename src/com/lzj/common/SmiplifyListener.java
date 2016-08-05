package com.lzj.common;

import com.lzj.antrls.LzjAntrlBaseListener;
import com.lzj.antrls.LzjAntrlParser;
import com.lzj.entity.Area;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzj on 2016/8/2.
 */
public class SmiplifyListener extends LzjAntrlBaseListener {
    public List<Area> areas = new ArrayList<>();  //the container for areas
    private boolean isAreas;



    @Override
    public void exitExp(LzjAntrlParser.ExpContext ctx) {
        super.exitExp(ctx);
        if (ctx.getChildCount()>3){

        }
    }
}
