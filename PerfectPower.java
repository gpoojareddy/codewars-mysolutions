public class PerfectPower {
  public static int[] isPerfectPower(int n) {
 
 int current = 2;
int	power = 2;
int	max = 500;
 do{
power = 2;
 while ( Math.pow( current, power ) <= n ) {
  		if ( n == Math.pow( current, power ) ) {
  			return new int[]{current,power};
  		} else {
  			power += 1;
  		}
  	}
  	current += 1;
  } while ( current <= max );
  return null;
  }
}
