package org.works.skm.api;

import java.util.ArrayList;
import java.util.List;

import org.works.skm.exception.SplitZeroSizeException;

public class ListPartitioner {
	
	/**
	 * Split is a function that divide an Array to many subArray with a maximal size equal to @param length.
	 *
	 * @param inList the in list
	 * @param len the length used to split
	 * @return outList the list partitioned
	 * @throws SplitZeroSizeException the split zero size exception
	 */
	public static <T> List<List<T>> partition(List<T> inList, int len) throws SplitZeroSizeException{
		if(len == 0){
			throw new SplitZeroSizeException("split number should be >0");
		}
		List<List<T>> outlist = new ArrayList<>();
		int pos=0;
		int inListSize =inList.size();
		boolean looping = true;
		do{
			if( (pos + len) < inListSize )
				outlist.add(inList.subList(pos, pos+len));
			else{
				outlist.add(inList.subList(pos, inListSize));		
				looping = false;
			}
			pos += len;
		}while(looping);
		
		return outlist;
	}
	
}
