import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sort_Sort_and_Sort_version2 {

	public static void main(String[] args)throws IOException {
		final BufferedReader scan = new BufferedReader(new
				InputStreamReader(System.in));

						// Create array for the numbers
						final int[] array = new int[10000];

						// Map for the output
						Map<Integer, List<Integer>> map = new TreeMap<Integer,List<Integer>>();

						String line;
						while((line = scan.readLine()) != null) {
							if(!line.isEmpty()) {
								String[] split = line.split(" ");
								// The amount of numbers in this test case
								int count = Integer.parseInt(split[0]);

								// The modulo number
								int mod = Integer.parseInt(split[1]);

								// Print headline
								System.out.println(line);

								// Termination condition
								if(count == 0 && mod == 0) {
									break;
								}

								// Read all numbers
								for(int i = 0; i < count; i++) {
									String str = scan.readLine();
									if(!str.isEmpty()) {
										array[i] = Integer.parseInt(str);
									} else {
										i--;
									}
								}

								// Sort the numbers
								Arrays.sort(array, 0, count);

								// Clear the map for this test case
								map.clear();

								for(int i = 0; i < count; i++) {
									// Current number
									int number = array[i];

									// Mod value from the current number
									int modValue = number % mod;

									// Check if the list exists
									if(!map.containsKey(modValue)) {
										// Create a new list for the mod value
										map.put(modValue, new ArrayList<Integer>());
									}

									// Select the list with current modValue
									List<Integer> list = map.get(modValue);

									// Even number
									if((number&1) == 0) {
										// Add the number at the end
										list.add(number);
									}
									// Odd number
									else {
										// Add the number at the start
										list.add(0, number);
									}
								}

								// Print the numbers
								for(Integer key: map.keySet()) {
									for(Integer number: map.get(key)) {
										System.out.println(number);
									}
								}
							}
						}
					}
				}
