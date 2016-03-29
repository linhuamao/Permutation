package jva.test;

public class Main {

	public static void main(String[] args) {


		Permutation a = new Permutation();
		// Object[] r = a.getPailie(new Object[]{"@","B"});
		// Object[] r = a.getPailie(new int[]{1,2,3,4});
		// Object[] r = a.getPailie(new Object[] { "@", "B", "1", "a", "9", "!" });

		Object[] r = a.getPermutation(new Object[] { "14", "2", "3"});
		printArray(r);
		r = a.getPermutation(new Object[] { "41", "2", "3"});
		printArray(r);

		System.out.println("run over!");

	}
	
	private static void printArray(Object[] r){
		for (int i = 0; i < r.length; i++) {
			Object[] temp = (Object[]) r[i];
			for(int j=0;j<temp.length;j++){
				System.out.print(temp[j]);
			}
			System.out.println();
		}
	}

}
