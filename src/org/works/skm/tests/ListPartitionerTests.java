package org.works.skm.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.works.skm.api.ListPartitioner;
import org.works.skm.exception.SplitZeroSizeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPartitionerTests{


	/**
	 * Test split List (size=8) with 0.
	 *
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test(expected=SplitZeroSizeException.class)
	public void testSplit_List_Length_8_split_0() throws SplitZeroSizeException{
		ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 0);
	}	

	/**
	 * Test split List (size=8) with 1.
	 *
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test
	public void testSplit_List_Length_8_split_1() throws SplitZeroSizeException{
		assertEquals(ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 1), 
		           Arrays.asList(Arrays.asList("1"), Arrays.asList("2"), Arrays.asList("3"),
		        		   		 Arrays.asList("4"), Arrays.asList("5"), Arrays.asList("6"),
		        		   		 Arrays.asList("7"),Arrays.asList("8")));
	}	
	
	
	/**
	 * Test split List (size=8) with 2.
	 *
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test
	public void testSplit_List_Length_8_split_2() throws SplitZeroSizeException {
		assertEquals(ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 2), 
		           Arrays.asList(Arrays.asList("1","2"), Arrays.asList("3","4"),
		        		   		 Arrays.asList("5","6"), Arrays.asList("7","8")));
	}
	
	/**
	 * Test split List (size=8) with 3.
	 *
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test
	public void testSplit_List_Length_8_split_3() throws SplitZeroSizeException{
		assertEquals(ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 3), 
		           Arrays.asList(Arrays.asList("1","2","3"),Arrays.asList("4","5","6"),
		        		   	 	 Arrays.asList("7","8")));
	}
	
	/**
	 * Test split List (size=8) with 4.
	 *
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test
	public void testSplit_List_Length_8_split_4() throws SplitZeroSizeException{
		assertEquals(ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 4), 
		           Arrays.asList(Arrays.asList("1","2","3","4"),
		        		   	 	 Arrays.asList("5","6","7","8")));
	}
	
	/**
	 * Test split List (size=8) with 5.
	 *
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test
	public void testSplit_List_Length_8_split_5() throws SplitZeroSizeException{
		assertEquals(ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 5), 
		           Arrays.asList(Arrays.asList("1","2","3","4","5"),
		        		   	 	 Arrays.asList("6","7","8")));
	}
	
	/**
	 * Test split List (size=8) with 8.
	 *
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test
	public void testSplit_List_Length_8_split_8() throws SplitZeroSizeException{
		assertEquals(ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 8), 
		           Arrays.asList(Arrays.asList("1","2","3","4","5","6","7","8")));
	}

	/**
	 *  Test split List with number > list size
	 * @return List with one Sub List
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@Test
	public void testSplit_List_Length_8_split_10() throws SplitZeroSizeException{
		assertEquals(ListPartitioner.partition(Arrays.asList("1", "2", "3", "4", "5","6","7","8"), 10), 
		           Arrays.asList(Arrays.asList("1","2","3","4","5","6","7","8")));
	}
}
