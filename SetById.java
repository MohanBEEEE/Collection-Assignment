package com.te.practiceweek;

import java.util.Comparator;

public class SetById implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.id-o2.id;
	}
	
}
