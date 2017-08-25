/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_31.java
* Copyright 2017-02-17 By Gnosis. Allright reserved.
* Time: обнГ1:52:04
*/
package com.chinasofti.eec.day013.exam;

public class Di_31 {

}

class One {
	public One foo() {
		return this;
	}
}

class Two extends One {
	public One foo() {
		return this;
	}
}

class Three extends Two {
	public One foo() {
		return this;
	}
}