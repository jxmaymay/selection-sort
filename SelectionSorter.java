import java.util.*;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
	int max = 0;
	for (int i = 0; i < wordList.size() - 1; i++) {
		max = 0;
		for (int j = 0; j < wordList.size() - i - 1; j++) {
			if (wordList.get(max).compareTo(wordList.get(j)) > 0) {
				max = (j);
			}
			Collections.swap(wordList, max, i);
	  }
	}
  }
}
