import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class IPCTRAIN {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int testCases = Integer.parseInt(br.readLine());
		String input[];
		int N, D;
		int Di, Ti, Si;

		while (testCases-- > 0) {
			input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			D = Integer.parseInt(input[1]);

			Teacher lecturers[] = new Teacher[N];
			MaxHeap maxHeap;

			for (int i = 0; i < N; i++) {
				lecturers[i] = new Teacher();
			}

			for (int i = 0; i < N; i++) {
				input = br.readLine().split(" ");
				Di = Integer.parseInt(input[0]);
				Ti = Integer.parseInt(input[1]);
				Si = Integer.parseInt(input[2]);

				Teacher teacher = new Teacher(Di, Ti, Si, i + 1);
				lecturers[i] = teacher;
			}

			// Sorting on basis of arrival
			Arrays.sort(lecturers);
			maxHeap = new MaxHeap(N, lecturers);

			int index = 0;
			long max_sadness = 0L;
			for (int current_date = 1; current_date <= D;) {

				while (index < N && lecturers[index].arrival_date <= current_date) {
					maxHeap.insertHeap(lecturers[index]);
					index++;
				}

				if (index < N) {
					int lectures = lecturers[index].arrival_date - current_date;
					maxHeap.extract_K_Max(lectures);
					current_date += lectures;
				} else {
					maxHeap.extract_K_Max(D - current_date + 1);
					break;
				}
			}

			max_sadness = 0;
			for (int i = 0; i < maxHeap.heapSize; i++) {
				max_sadness += (long) ((long) maxHeap.scheduleHeap[i].sadness
						* (long) maxHeap.scheduleHeap[i].lectures);
			}

			pw.println(max_sadness);
		}

		br.close();
		pw.close();
	}

}

class MaxHeap {

	int heapSize;
	Teacher scheduleHeap[];

	MaxHeap(int N, Teacher[] lecturers) {
		heapSize = 0;
		scheduleHeap = new Teacher[N];
		for (int i = 0; i < N; i++) {
			scheduleHeap[i] = new Teacher();
			scheduleHeap[i] = lecturers[i];
		}
	}

	public void extract_K_Max(int K) {

		while (K-- > 0 && heapSize > 0) {
			scheduleHeap[0].lectures--;
			if (scheduleHeap[0].lectures <= 0) {
				remove(scheduleHeap);
			}
		}
	}

	public void insertHeap(Teacher teacher) {

		int current = heapSize;
		scheduleHeap[heapSize++] = teacher;

		while (scheduleHeap[current].sadness > scheduleHeap[parent(current)].sadness) {
			Teacher temp = scheduleHeap[current];
			scheduleHeap[current] = scheduleHeap[parent(current)];
			scheduleHeap[parent(current)] = temp;
			current = parent(current);
		}
	}

	public Teacher remove(Teacher[] scheduleHeap) {
		scheduleHeap[0].sadness = 0;
		scheduleHeap[0].lectures = 0;
		Teacher popped = scheduleHeap[0];
		scheduleHeap[0] = scheduleHeap[heapSize - 1];
		heapSize--;
		maxHeapify(0);
		return popped;
	}

	public void maxHeapify(int pos) {
		int left = leftChild(pos);
		int right = rightChild(pos);
		int largest;
		if (left < heapSize && scheduleHeap[left].sadness > scheduleHeap[pos].sadness)
			largest = left;
		else
			largest = pos;

		if (right < heapSize && scheduleHeap[right].sadness > scheduleHeap[largest].sadness) {
			largest = right;
		}

		if (largest != pos) {
			Teacher temp = scheduleHeap[pos];
			scheduleHeap[pos] = scheduleHeap[largest];
			scheduleHeap[largest] = temp;
			maxHeapify(largest);
		}
	}

	private int leftChild(int pos) {
		return 2 * pos + 1;
	}

	private int rightChild(int pos) {
		return 2 * pos + 2;
	}

	private int parent(int pos) {
		return (pos - 1) / 2;
	}

	public void print() {
		for (int i = 0; i < heapSize; i++) {
			System.out.print("\t" + scheduleHeap[i]);
			System.out.println();
		}
	}

}

class Teacher implements Comparable<Teacher> {

	int lectures;
	int sadness;
	int arrival_date;
	String name;

	Teacher(int Di, int Ti, int Si, int num) {
		lectures = Ti;
		sadness = Si;
		arrival_date = Di;
		name = "T-" + num;
	}

	Teacher() {

	}

	@Override
	public String toString() {
		// return "Name: " + name;
		return "Name: " + name + "\tLectures = " + lectures + "\tArrival Date = " + arrival_date + "\tSadness = "
				+ sadness;
	}

	@Override
	public int compareTo(Teacher o) {
		return this.arrival_date - o.arrival_date;
	}
}

class SortBySadness implements Comparator<Teacher> {

	public int compare(Teacher t1, Teacher t2) {
		return (t2.sadness - t1.sadness);
	}
}

class SortByArrival implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {

		return t1.arrival_date - t2.arrival_date;
	}

}
