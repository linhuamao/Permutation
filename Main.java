package jva.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import jva.test.iccid.ChinaMobileICCID;
import jva.test.iccid.ChinaTelcomICCID;
import jva.test.iccid.ChinaUnionICCID;
import jva.test.ip.GetRandomIP;
import jva.test.ip.IPTranslate;
import jva.test.safe.AESUtils;
import net.zip4j.core.ZipFile;

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
