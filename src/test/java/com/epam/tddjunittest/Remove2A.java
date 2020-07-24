package com.epam.tddjunittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Remove2A {
	Remove2Achar r;
	@Before 
	public void setup() {
		r=new Remove2Achar();
	}
	@Test
	public void test() {
		assertEquals("BC",r.remove2A("ABC"));
	}
	@Test
	public void test1() {
		assertEquals("CD",r.remove2A("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",r.remove2A("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",r.remove2A("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",r.remove2A("AABAA"));
	}
}
