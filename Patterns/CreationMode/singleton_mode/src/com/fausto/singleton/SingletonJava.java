package com.fausto.singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: fausto
 * @date: 2021/10/17 14:22
 * @description:  Java实现单例模式
 */

/**
 *      饿汉式线程安全(静态代码块)
 */
class Singleton_Java0{
	private Singleton_Java0(){}
	private static Singleton_Java0 instance;
	static {
		instance = new Singleton_Java0();
	}
	public static Singleton_Java0 getInstance(){
		return instance;
	}
	
}

/**
 *      饿汉式线程安全
 */
class Singleton_Java1{
	public Singleton_Java1(){}
	
	private final static Singleton_Java1 instance = new Singleton_Java1();
	
	public static Singleton_Java1 getInstance() {
		return instance;
	}
}

/**
 *      懒汉式线程不安全(不推荐使用)
 */
class Singleton_Java2{
	protected Singleton_Java2(){}
	private static Singleton_Java2 instance = null;
	
	public static Singleton_Java2 getInstance() {
		if (null == instance){
			instance = new Singleton_Java2();
		}
		return instance;
	}
}

/**
 *      懒汉式线程安全(安全但不高效,不推荐)
 */
class Singleton_Java3{
	private Singleton_Java3(){}
	private static Singleton_Java3 instance = null;
	
	public static synchronized Singleton_Java3 getInstance() {
		if (null == instance){
			instance = new Singleton_Java3();
		}
		return instance;
	}
}

/**
 *      懒汉式线程安全(同步代码块 , 实际上无法保证线程安全 , 不推荐)
 */
class Singleton_Java4{
	private Singleton_Java4(){}
	private static Singleton_Java4 instance = null;
	
	public static  Singleton_Java4 getInstance() {
		if (null == instance){
			synchronized (Singleton_Java4.class){
				instance = new Singleton_Java4();
			}
		}
		return instance;
	}
}

/**
 *      双重校验锁式(推荐)
 */
class Singleton_Java5{
	private Singleton_Java5(){}
	private static volatile Singleton_Java5 instance = null;
	
	public static  Singleton_Java5 getInstance() {
		if (null == instance){
			synchronized (Singleton_Java5.class){
				if(null == instance){
					instance = new Singleton_Java5();
				}
			}
		}
		return instance;
	}
}

/**
 *      静态内部类( 静态内部类不会在外类加载时加载,只有使用时才会被加载,所以可以达到延迟效果 )
 */
class Singleton_Java6{
	private Singleton_Java6(){}
	private static class SingletonInstance{
		private static final Singleton_Java6 INSTANCE = new Singleton_Java6();
	}
	public Singleton_Java6 getInstance(){
		return SingletonInstance.INSTANCE;
	}
}

/**
 *      枚举方式
 */
enum Singleton_Java{
	INSTANCE
}


public class SingletonJava {
	public static void main(String[] args) throws NoSuchMethodException {
		
		//(new Test(new Singleton_Java2() , 10)).threadTest();
		System.out.println(Singleton.INSTANCE.hashCode());
		System.out.println(Singleton.INSTANCE.hashCode());
		System.out.println(Singleton.INSTANCE.hashCode());
		System.out.println(Singleton.INSTANCE.hashCode());

	}
	
	private static class Test<T>{
		private T type;
		private Integer num;
		
		public Test(T type , Integer num){
			this.type = type;
			this.num = num;
		}
		
		private void test()  {
			
			Method getInstance = null;
			try {
				getInstance = type.getClass().getMethod("getInstance");
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
			for (int i=0 ; i<num; i++){
				try {
					System.out.println(Thread.currentThread().getName()+"=="+getInstance.invoke(type)+"---->"+i);
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				
			}
		}
		public void threadTest() throws NoSuchMethodException {
			
			new Thread(() -> {
				test();
				
			}).start();
			new Thread(() -> {
				test();
			}).start();
			new Thread(() -> {
				test();
			}).start();
		}
	}
}