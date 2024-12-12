package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int count) {
		System.out.println();
		
		int found = 0;
		int i = 0;
		
		while (found < count) {
			int sq = i * i;
			
			if (isConsecutiveSum(sq)) {
				System.out.println(sq);
				found++;
			}
			
			i++;
		}
	}
	
	public static boolean isConsecutiveSum(int num) {
		int i = 1;
		int sum = 0;
		
		while (sum < num) {
			sum += i;
			
			if (sum == num) {
				return true;
			}
			
			i++;
		}
		
		return false;
	}
}
