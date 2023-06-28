import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue {
	public static void main(String args[]) {
		List<Integer> list= Arrays.asList(2,4,6,8,10);
		
		Optional<Integer> maxValue = list.stream()
				.max((i,j) -> i.compareTo(j));
				System.out.println(maxValue.get());
	}

}
