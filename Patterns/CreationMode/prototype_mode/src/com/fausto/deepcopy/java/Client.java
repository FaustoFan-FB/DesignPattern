package com.fausto.deepcopy.java;

/**
 * @author: fausto
 * @date: 2021/10/29 16:51
 * @description:
 */
public class Client {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DeepProtoType p = new DeepProtoType();
		p.name = "�ν�";
		p.deepCloneableTarget = new DeepCloneableTarget("��ţ", "Сţ");
		
	

//		DeepProtoType p2 = (DeepProtoType) p.clone();
//
//		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
		
		
		DeepProtoType p2 = (DeepProtoType) p.deepClone();
		
		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
		
	}
}