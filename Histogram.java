package histogram_for_data;

import java.util.*;
import java.util.stream.LongStream;

public class Histogram
{
	
	static String path_to_the_file = "";
	private static Scanner scanner;
	
	public static void main()
	{
	long distributions[] = new long[32];
	for(int i = 0 ; i < distributions.length ; ++i)
		distributions[i] = -1;
	scanner = new Scanner(path_to_the_file);
	
	scanner.nextLine();
	long index;
	while(scanner.hasNext())
	{
		index =   scanner.nextLong();
		if(index < 32 && index >= 0)
			distributions[(int)index]++;
	}
	
	long sum = LongStream.of(distributions).sum();
	
	for(int i = 0 ; i < distributions.length ; ++i)
		System.out.println(i + ": " +distributions[i]);
	System.out.println("sum = " + sum);
	}
}
