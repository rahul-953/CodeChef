

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

class WSITES01_6 {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 0;

		List<String> unblocked_list = new LinkedList<String>();
		List<String> blocked_list = new LinkedList<String>();
		List<String> filter = new LinkedList<String>();

		String read;
		for (; i < n; i++) {
			read = sc.next();
			if (read.equals("+")) {
				read = sc.next();
				unblocked_list.add(read);
			} else {
				read = sc.next();
				blocked_list.add(read);
			}
		}

		Collections.sort(unblocked_list);
		Collections.sort(blocked_list);

		boolean possible = true;
		int j = 0;
		for (String not_req : blocked_list) {
			if (!possible)
				break;
			for (String req : unblocked_list) {
				if (!possible)
					break;
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
								firewall = firewall + not_req.charAt(k);
								// System.out.println("Adding in filter : "
								// +firewall);
								filter.add(firewall);
								break;
							} else {
								firewall = firewall + req.charAt(k);
								// System.out.println("firewall = " + firewall);
							}
						}
					}
				}
			}
		}

		Collections.sort(filter);
		int count = 0;
		int len = filter.size();
		for (i = 1; i < len - count; i++) {
			String s1 = filter.get(i - 1);
			String s2 = filter.get(i);

			if (canMerge(s1, s2)) {
				count++;
				filter.remove(i - 1);
				i--;
			}
		}

		if (possible) {
			System.out.println(filter.size());
			for (String firewall : filter) {
				System.out.println(firewall);
			}
		} else {
			System.out.println("-1");
		}
	}

	public static boolean canMerge(String s1, String s2) {

		if (s1.startsWith(s2) || s2.startsWith(s1)) {
			return true;
		}
		return false;
	}
}

/**
 * 
 * 
 * int j = 0; i = 0; int len1 = blocked_list.size(); int len2 =
 * unblocked_list.size(); boolean possible = true; for (i = 0; i < len1 && j <
 * len2;) { String not_req = blocked_list.get(i); String req =
 * unblocked_list.get(j); // System.out.println("Comparing Strings " + not_req +
 * " , " + req); if (req.startsWith(not_req)) { possible = false; break; } else
 * { String firewall = ""; int len = (int) Math.min(not_req.length(),
 * req.length());
 * 
 * if (not_req.startsWith(req)) { // System.out.println("Entering expected");
 * len = req.length(); firewall = req + not_req.charAt(len);
 * filter.add(firewall); } else { for (int k = 0; k < len; k++) { if
 * (req.charAt(k) != not_req.charAt(k)) { firewall += not_req.charAt(k); //
 * System.out.println("Adding in filter : " + // firewall);
 * filter.add(firewall); break; } else { firewall += req.charAt(k); //
 * System.out.println("firewall = " + firewall); } } } } if
 * (not_req.compareTo(req) < 0) { i++; } else { j++; } }
 * 
 * if (i < len1) { for (i = i + 1; i < len1; i++) { String not_req =
 * blocked_list.get(i); filter.add(Character.toString(not_req.charAt(0))); }
 * 
 * }
 * 
 * Collections.sort(filter); int len = filter.size();
 * 
 * // System.out.println("Filter after sorting : "); // for (String filt :
 * filter) // System.out.println(filt); //
 * System.out.println("===============");
 * 
 * int count = 0; for (i = 1; i < len - count; i++) { String s1, s2; s1 =
 * filter.get(i - 1); s2 = filter.get(i);
 * 
 * if (canMerge(s1, s2)) { // Remove less length filter count++; filter.remove(i
 * - 1); i--; } }
 * 
 * if (possible) { System.out.println(filter.size()); for (String firewall :
 * filter) { System.out.println(firewall); } } else { System.out.println("-1");
 * }
 * 
 * sc.close(); }
 * 
 * public static boolean canMerge(String s1, String s2) {
 * 
 * if (s1.startsWith(s2) || s2.startsWith(s1)) { return true; } return false; }
 * 
 */