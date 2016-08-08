package com.lianggzone.designpattern.cor.action.score;

/**
 * Handler
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Handler {

	protected Handler handler;
	
	public void addLast(Handler handler) {
        this.handler = handler;
    }
	
	public abstract void execute(int value);
}
