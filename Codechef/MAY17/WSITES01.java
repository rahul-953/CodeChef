
import java.util.*;
import java.io.*;

/**
 * 
 * 
 * 
 * @author rahul
 *
 */

/*
 * 5 + codechef - codeforces + apple - apples + kjkkjk
 */

class WSITES01 {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(br.readLine());
		int i = 0;

		List<String> unblocked_list = new LinkedList<String>();
		List<String> blocked_list = new LinkedList<String>();
		List<String> filter = new LinkedList<String>();

		String read[];
		for (; i < n; i++) {
			read = br.readLine().split(" ");
			if (read[0].equals("+")) {
				unblocked_list.add(read[1]);
			} else {
				blocked_list.add(read[1]);
			}
		}

		Collections.sort(unblocked_list);
		Collections.sort(blocked_list);

		boolean possible = true;
		for (String not_req : blocked_list) {
			if (!possible)
				break;
			for (String req : unblocked_list) {

				if (!possible)
					break;

				if (req.charAt(0) != not_req.charAt(0))
					filter.add(Character.toString(not_req.charAt(0)));
				if (req.startsWith(not_req))
					possible = false;
				else {
					String firewall = "";
					int len = (int) Math.min(not_req.length(), req.length());

					if (not_req.startsWith(req)) {
						// System.out.println("Entering expected");
						len = req.length();
						firewall = req + not_req.charAt(len);
						filter.add(firewall);
					} else {
						firewall = "";
						for (int k = 0; k < len; k++) {
							if (req.charAt(k) != not_req.charAt(k)) {
								firewall += not_req.charAt(k);
								filter.add(firewall);
								break;
							} else {
								firewall += req.charAt(k);
							}
						}
					}
				}
			}
		}

		Collections.sort(filter);
		int count = 0;
		int len = filter.size();
		String ans[][] = new String[len][2];
		for (String filt : filter) {
			ans[count][0] = filt;
			ans[count++][1] = "0";
		}

		count = 0;
		int prev_i = 0;
		for (i = 1; i < len; i++) {
			// String s1 = filter.get(i -1);
			String s1 = ans[prev_i][0];
			String s2 = ans[i][0];
			// String s2 = filter.get(i);

			if (canMerge(s1, s2)) {
				if (s1.compareTo(s2) > 0) {
					ans[i][1] = "1";
				} else {
					ans[prev_i][1] = "1";
					prev_i = i;
				}
			} else {
				prev_i = i;
				count++;
			}
		}

		if (possible) {
			count=0;
			for (i = 0; i < len; i++) {
				if (!ans[i][1].equals("1"))
					count++;
			}
			pw.println(count);
			for (i = 0; i < len; i++) {
				if (!ans[i][1].equals("1"))
					pw.println(ans[i][0]);
			}
		} else {
			pw.println("-1");
		}

		br.close();
		pw.close();
	}

	public static boolean canMerge(String s1, String s2) {

		if (s1.startsWith(s2) || s2.startsWith(s1)) {
			return true;
		}
		return false;
	}
}