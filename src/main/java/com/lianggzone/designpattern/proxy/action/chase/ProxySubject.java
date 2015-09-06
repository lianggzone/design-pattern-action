/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.proxy.action.chase;

/**
 * 代理对象
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class ProxySubject implements Chaseable{

	private PursuitSubject pursuit;
	
	public ProxySubject(PursuitSubject pursuit) {
		this.pursuit = pursuit;
	}

	@Override
	public void giveFlowers() {
		System.out.println(" 记录日志 ");
		pursuit.giveFlowers();
		System.out.println(" 结束日志 ");
	}
}
