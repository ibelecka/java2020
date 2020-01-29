package jtm.activity06;

import java.util.Arrays;

public class TestAlien {

	
	
	public TestAlien() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] backpack = {"12", "13","", "","", "13","", "","", ""};
//		backpack = {"", "","", "","", "","", "","", ""};
		String item = "na";
		int n = 0;
	//		for (int i = 0; i < backpack.length; i++) {
			while (!(backpack[n].isEmpty())) {
				n++;
			}
					backpack[n] = item;
	//				item +="a";
//					System.out.println(backpack[i]);
				//			}
			System.out.println(Arrays.deepToString(backpack));
		}


	}


