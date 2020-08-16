public class Exercise5 {
	/**
	
	Insertion Sort
	{1, 29, 14, 15, 94}
	1 is compared to 29, finds correct ascending order
	29 is compared to 14, finds that 14 is not in correct position so 14 and 29 positions are swapped
	1, 14, 29, 15, 94
	1 and 14 are compared and are in correct positions
	29 is then compared to 15, finds that 15 is not in correct position so 15 and 29 positions are swapped
	1, 14, 15, 29, 94
	15 is compared to 14 to make sure list is correctly sorted and is in correct order
	29 is compared to 94 and is found to be in correct order and list is now correctly sorted
	
	Selection Sort
	{1, 29, 14, 15, 94}
	The first position is selected and scans the whole list sequentially for a value less than the first position, which none are less than 1 so the first position is correct
	The second position is then selected and scans the rest of the list for the next lowest value after 1, which would be 14, so 14 and 29 are swapped
	1, 14, 29, 15, 94
	The third position is then selected and scans the rest of the list for the next lowest value after 14, which would be 15, so 29 and 15 are swapped
	1, 14, 15, 29, 94
	The fourth position is selected and searches the rest of the list for a value lower than 29, but none are found, and list is correctly sorted
	
	*/
}
