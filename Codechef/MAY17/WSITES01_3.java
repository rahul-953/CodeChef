
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

class WSITES01_3 {

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
				
				if( req.charAt(0)!= not_req.charAt(0))
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

		int count = 0;
		int len = filter.size();
		for (i = 1; i < len - count; i++) {
			String s1 = filter.get(i - 1);
			String s2 = filter.get(i);

			if (canMerge(s1, s2)) {
				count++;
				String remove = s1.compareTo(s2) > 0 ? filter.remove(i) : filter.remove(i - 1);
				i--;
			}
		}

		if (possible) {
			pw.println(filter.size());
			for (String firewall : filter) {
				pw.println(firewall);
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