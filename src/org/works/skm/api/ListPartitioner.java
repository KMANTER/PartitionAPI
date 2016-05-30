package org.works.skm.api;

import java.util.ArrayList;
import java.util.List;

import org.works.skm.exception.SplitZeroSizeException;

public class ListPartitioner {
	
	
	/**
	 * Split is a function that divide an Array to many subArray with a maximal size equal to @param length.
	 *
	 * @param inList the in list
	 * @param length the length used to split
	 * @return the list partitioned
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	@SuppressWarnings("rawtypes")
	public static List<List> Split(List inList, int length) throws SplitZeroSizeException {
		if(length == 0){
			throw new SplitZeroSizeException("split number should be >0");
		}
	    List<List> outlists = new ArrayList<>();
	    List<Object> tmpList ;
	    int i = 0;
	    while (i < inList.size()) {
	    	tmpList = new ArrayList<>();
	    	for (int j = 0; i < inList.size() && j<length; j++) {
				tmpList.add(inList.get(i));
				i++;
			}
	    	outlists.add(tmpList);
	    }
	    return outlists;
	}
	
}
