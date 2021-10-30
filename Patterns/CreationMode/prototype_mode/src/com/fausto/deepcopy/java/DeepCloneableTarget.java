package com.fausto.deepcopy.java;

import java.io.Serializable;

/**
 * @author: fausto
 * @date: 2021/10/29 16:52
 * @description:
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	private String cloneName;
	
	private String cloneClass;
	
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}