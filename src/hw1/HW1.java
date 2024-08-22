package hw1;

public class HW1 {
	public static void main(String[] args) {
//		1. 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println("sum = " + (a + b));
		System.out.println("product = " + (a * b));

//		2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int c = 200;
		int eggsdozen = c / 12, lefteggs = c % 12;
		System.out.println("200顆蛋一共是" + eggsdozen + "打" + lefteggs + "顆");

//		3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

//		4. 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double Pi = 3.1415;
		int radius = 5;
		double circlearea = Math.pow(radius, 2) * Pi, circumference = radius * 2 * Pi;
		System.out.printf("半徑為5的圓面積為%.5f、圓周長為%.5f%n", circlearea, circumference);

//		5. 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		   金加利息共有多少錢 (用複利計算,公式請自行google)

//		6. 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		   5 + 5
//		   5 + ‘5’
//		   5 + “5”
//		並請用註解各別說明答案的產生原因
		int i = 5;
		System.out.println(i + " + " + i);// 5 + 5中的兩個五都是數字只有 + 要以文字形式印出來所以加上的""
		System.out.println(i + " + '" + i + "'");// 5 +'5'中的 + 與''都要以文字形式印出來所以加上了""
		System.out.println(i + " + \"" + i + "\"");// 5 + "5"中的 + 與 ""都要以文字形式印出來，所以前面都要加上""，
//      但因為"本身是具有功能的因此需要在前面加上\去除它的功能它才能作為文字顯示

	}

}
