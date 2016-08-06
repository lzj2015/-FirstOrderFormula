package com.lzj.common;

import com.lzj.entity.Function;

/**
 * Created by lzj on 2016/8/6.
 */
public interface OptionListener {
    /**
     * for example first is r(1) and second is r(2)  they are all area variables
     * and we can calculate their result
     *
     * @param first
     * @param second
     */
    void doubleConst(Function first, Function second);

    /**
     * only know the first is area variable
     * so there we just to simplify the sentence
     *
     * @param first
     * @param second
     */
    void leftConst(Function first, Function second);

    /**
     * mentioned above  we just only know the right is area variable
     * and then we simplify the sentence
     *
     * @param first
     * @param second
     */
    void rightConst(Function first, Function second);

    /**
     * we do not know  all of variable so we just to deliver the variable
     * @param first
     * @param second
     */
    void NotConst(Function first, Function second);

    /**
     * return the simplify result
     *
     * @return
     */
    Function getResult();
}
