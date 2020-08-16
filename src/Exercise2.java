public class Exercise2 {

	int foo(int N) {
		 int result = 0;
		 for (int i=0; i<N; i++)
		 result++;
		 for (int j=0; j<1000000; j++)
		 result+=j;

		 return result;
		}

}

	/**
	The time complexity of this java method is O(N).
	*/