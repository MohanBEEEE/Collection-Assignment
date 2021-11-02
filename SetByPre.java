package com.te.practiceweek;

import java.util.Comparator;

public class SetByPre implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return (int) (o1.per-o2.per);
	}

}
