
public class Main {

	public static void main(String[] args) {
		int uzunluk = 10;
		for (int satir=0; satir<uzunluk; satir++) {
			System.out.print("");
			for(int sutun=0; sutun<satir; sutun++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
