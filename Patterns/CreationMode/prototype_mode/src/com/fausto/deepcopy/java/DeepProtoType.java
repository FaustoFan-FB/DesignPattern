package com.fausto.deepcopy.java;

import java.io.*;

/**
 * @author: fausto
 * @date: 2021/10/29 16:52
 * @description:
 */
public class DeepProtoType implements Serializable, Cloneable {
	public String name; //String ����
	public DeepCloneableTarget deepCloneableTarget;// ��������
	public DeepProtoType() {
		super();
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep = null;
	
		deep = super.clone();
	
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
		
		
		return deepProtoType;
	}
	

	
	public Object deepClone() {
		
	
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
		
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
		
			e.printStackTrace();
			return null;
		} finally {
			
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				
				System.out.println(e2.getMessage());
			}
		}
		
	}
}