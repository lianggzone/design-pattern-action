/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.proxy.action.jdk_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class ProxyClient {
	
	public static void main(String[] args) {
		RealSubject rs = new RealSubject();
		InvocationHandler ds = new DynamicSubject(rs);
		Class cls = rs.getClass();
		   
		Subject subject = (Subject)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), ds);
		subject.doSomething();
	}

}
