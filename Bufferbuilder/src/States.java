
import java.util.*;

class States {
	public static void main(String[] args) {

		// State names

		String[] states = { "California,", "Alabama,", "Arkansas,", "Arizona,", "Alaska,", "Colorado,", "Connecticut,",
				"Delaware,", "Florida,", "Georgia,", "Hawaii,", "Idaho,", "Illinois,", "Indiana,", "Iowa,", "Kansas,",
				"Kentucky,", "Louisiana,", "Maine,", "Maryland,", "Massachusetts,", "Michigan,", "Minnesota,",
				"Mississippi,", "Missouri,", "Montana,", "Nebraska,", "Nevada,", "New Hampshire,", "New Jersey,",
				"New Mexico,", "New York,", "North Carolina,", "North Dakota,", "Ohio,", "Oklahoma,", "Oregon,",
				"Pennsylvania,", "Rhode Island,", "South Carolina,", "South Dakota,", "Tennessee,", "Texas,", "Utah,",
				"Vermont,", "Virginia,", "Washington,", "West Virginia,", "Wisconsin,", "Wyoming" };

		// State names in alphabetical order

		Arrays.sort(states);

		// Output

		System.out.println("The 50 States are:");
		for (int i = 0; i < states.length; i++) {
			System.out.print(states[i] + "");
		}
		HashSet<String> h = new HashSet<String>();

		// adding into HashSet
		h.add("California,");
		h.add("Virgini,");
		h.add("Florida");
		// printing HashSet
		System.out.println(h);

		// Iterating over hash set items
		System.out.println("Using Hashset:");
		java.util.Iterator<String> i1 = h.iterator();

		while (i1.hasNext())
			System.out.print(i1.next());

		TreeSet<String> ts1 = new TreeSet<String>();
	System.out.println("\n using treeset");
		ts1.add("alabama");
		ts1.add("california");
		ts1.add("virginia");

		// Duplicates will not get insert
		ts1.add("colorado");
		

		// Elements get stored in default natural
		// Sorting Order(Ascending)
		System.out.println(ts1); // [A,B,C]

		// ts1.add(2) ; will throw ClassCastException
		// at run time

		Iterator<String> iterator = ts1.iterator();

		// Displaying the Tree set data
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		System.out.println("Now the size of tree set: " + ts1.size());

		// Remove all
		ts1.clear();
		if (ts1.isEmpty()) {
			System.out.print("Tree Set is empty.");
		} else {
			System.out.println("Tree Set size: " + ts1.size());
		}
	}
}
