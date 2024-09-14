package jtraining23;

/**
 * x y 入れ替え クラス
 */
	public class Jtraining23 {	
	/**
	 * main　メソッド
	 * param args　実行引数
	 */
		 public static void main(String[] args) {
			int x = 4;
			int y = 3;
			int t = 0;
			
			t = x;
			x = y;
			y = t;
			
			System.out.println(x);
			System.out.println(y);
		}	
}	