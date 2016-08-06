package com.lianggzone.designpattern.strategy.action.duck;

/**
 * Context
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月15日  v0.1</p><p>版本内容: 创建</p>
 */
public class Context {

    public Duck duck;

    public Context(Duck duck) {
        super();
        this.duck = duck;
    }
    
    public void fly(){
        duck.fly();
    }
}
