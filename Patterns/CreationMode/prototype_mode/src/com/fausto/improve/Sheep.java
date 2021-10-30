package com.fausto.improve;

/**
 * @author: fausto
 * @date: 2021/10/29 15:29
 * @description:
 */
public class Sheep implements Cloneable{
	String name;
	Integer age;
	String color;
	
	public Sheep(String name, Integer age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Sheep{" +
				"name='" + name + '\'' +
				", age=" + age +
				", color='" + color + '\'' +
				'}';
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		}catch (Exception e){
			System.out.println(e);
		}
		return sheep;
	}
}