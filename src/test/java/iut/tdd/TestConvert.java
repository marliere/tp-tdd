package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zero", Convert.num2text("0"));
	}
	
	@Test
	public void test_num2text_un () {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	
	@Test
	public void test_num2text_quatorze () {
		Assert.assertEquals("quatorze", Convert.num2text("14"));
	}
	
	@Test
	public void test_num2text_seize () {
		Assert.assertEquals("seize", Convert.num2text("16"));
	}
	
	@Test
	public void test_num2text_trente () {
		Assert.assertEquals("trente", Convert.num2text("30"));
	}
	
	@Test
	public void test_num2text_dix_sept () {
		Assert.assertEquals("dix sept", Convert.num2text("17"));
	}
	
	@Test
	public void test_num2text_dix_neuf () {
		Assert.assertEquals("dix neuf", Convert.num2text("19"));
	}
	
	@Test
	public void test_num2text_vingt () {
		Assert.assertEquals("vingt", Convert.num2text("20"));
	}
	
	@Test
	public void test_num2text_vingt_deux () {
		Assert.assertEquals("vingt deux", Convert.num2text("22"));
	}
	
}
