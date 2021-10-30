package com.fausto.poor;

/**
 * @author: fausto
 * @date: 2021/10/29 15:20
 * @description:
 */
public class Sheep {
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
}