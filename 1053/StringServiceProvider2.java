package com.htc.javaex3;

import java.io.Serializable;

public abstract class StringServiceProvider2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String stringvar;
		
	public StringServiceProvider2(String stringvar) {
		StringServiceProvider2.stringvar = stringvar;
	}
	public StringServiceProvider2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static String getStringvar() {
		return stringvar;
	}
	public static void setStringvar(String stringvar) {
		StringServiceProvider2.stringvar = stringvar;
	}
	
	public static String revStringvar() {
		return new StringBuffer(StringServiceProvider2.stringvar).reverse().toString();	
	}
	
	public static boolean srchStringvar(CharSequence substr) {
	return StringServiceProvider2.stringvar.contains(substr);
			
	}
	
	public static String repStringvar(CharSequence substr1,CharSequence substr2) {
		return StringServiceProvider2.stringvar.replace(substr1, substr2);
				
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stringvar == null) ? 0 : stringvar.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (stringvar == null) {
			if (StringServiceProvider2.stringvar != null)
				return false;
		} else if (!stringvar.equals(StringServiceProvider2.stringvar))
			return false;
		return true;
	}
	

}
