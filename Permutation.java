package jva.test;

import java.util.ArrayList;

public class Permutation {

	public Object[][] getPermutation(Object[] shuzu) {

		if (shuzu == null || shuzu.length == 0) {
			return null;
		}

		if (shuzu.length == 1) {
			Object[][] r = new Object[1][];
			r[0] = shuzu;
			return r;
		}

		ArrayList<Object[]> al = new ArrayList<Object[]>();
		for (int i = 0; i < shuzu.length; i++) {
			Object head = shuzu[i];
			Object[] temp = getNewArray(shuzu, i);
			Object[][] temp2 = getPermutation(temp);

			for (int j = 0; j < temp2.length; j++) {
				Object[] r = addHead(head, temp2[j]);
				al.add(r);
			}

		}
		Object[][] result = new Object[al.size()][];
		for(int i=0;i<result.length;i++){
			result[i]=al.get(i);
		}

		return result;

	}

	private Object[] addHead(Object head, Object[] tail) {
		Object[] result = new Object[tail.length + 1];

		result[0] = head;
		for (int i = 1; i < result.length; i++) {
			result[i] = tail[i - 1];
		}
		return result;
	}

	private Object[] getNewArray(Object[] array, int i) {
		Object[] newArray = new Object[array.length - 1];
		int count = 0;
		for (int j = 0; j < array.length; j++) {
			if (i != j) {
				newArray[count++] = array[j];
			}
		}
		return newArray;
	}

}
