import java.util.Scanner;

class CHEFSPL {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int d;
		d = sc.nextInt();
		String str;
		while (d-- > 0) {
			int alpha[] = new int[26];
			str = sc.next();
			int i;
			int j;
			int slen = str.length();
			if (slen == 1) // case1 :single char
			{
				System.out.print("NO\n");
				continue;
			}
			if (slen % 2 == 0) // case2: even length string can only be double
								// string with zero removals
			{
				int flag1 = 0;
				i = 0;
				j = slen / 2;
				for (i = 0, j = slen / 2; i < slen / 2; i++, j++) {
					if (str.charAt(i) != str.charAt(j)) {
						flag1 = 1;
						break;
					}
				}
				if (flag1 == 0) {
					System.out.print("YES\n");
					continue;
				} else {
					System.out.print("NO\n");
					continue;
				}
			}

			for (i = 0; i < 26; i++) {
				alpha[i] = 0;
			}

			for (i = 0; i < slen; i++) // count freq of char.
			{
				alpha[str.charAt(i) - 'a']++;
			}

			int count = 0;
			int index = 0;
			for (i = 0; i < 26; i++) // how many char have odd occurance
			{
				if (alpha[i] % 2 != 0) {
					count++;
					index = i;
				}
			}

			if (count != 1) // case 3: more than one odd char
			{
				System.out.print("NO\n");
				continue;
			}

			char repeating_char = (char) (index + 97);
			if (str.charAt(slen / 2) != repeating_char) // case 4:middle char is
														// not repeating char
			{
				int countl = 0;
				int countr = 0;
				for (i = 0; i < slen / 2; i++) {
					if (str.charAt(i) == repeating_char)
						countl++;
				}
				for (i = slen / 2 + 1; i < slen; i++) {
					if (str.charAt(i) == repeating_char)
						countr++;
				}

				int flag_double = 0;
				int skipped = 0;
				if (countl > countr) {
					for (i = 0, j = (slen / 2) + 1; i <= slen / 2 && j < slen;) {
						if (str.charAt(i) == str.charAt(j)) {
							i++;
							j++;
							continue;
						} else {
							if (skipped == 0) // 1 skip is allowed
							{
								if (str.charAt(i) == repeating_char) {
									skipped++;
									i++;
									continue;
								} else // subcase 4.1:mismatch coz of the some
										// char other than repeating char which
										// cant be removed
								{
									flag_double = 1;
									break;
								}
							} else // subcase 4.2:one char already skipped and
									// still a mismatch.more than one skips are
									// not allowed
							{
								flag_double = 1;
								break;
							}
						}
					}
				} else if (countl < countr) {
					for (i = 0, j = (slen / 2); i < slen / 2 && j < slen;) {
						if (str.charAt(i) == str.charAt(j)) {
							i++;
							j++;
							continue;
						} else {
							if (skipped == 0) // 1 skip is allowed
							{
								if (str.charAt(j) == repeating_char) {
									skipped++;
									j++;
									continue;
								} else // subcase 4.1:mismatch coz of the some
										// char other than repeating char which
										// cant be removed
								{
									flag_double = 1;
									break;
								}
							} else // subcase 4.2:one char already skipped and
									// still a mismatch.more than one skips are
									// not allowed
							{
								flag_double = 1;
								break;
							}
						}
					}
				}
				if (flag_double == 1) {
					System.out.print("NO\n");
					continue;
				} else if (flag_double == 0) // subcase 4.3: string is a double
												// string
				{
					System.out.print("YES\n");
					continue;
				}
			} else if (str.charAt(slen / 2) == repeating_char) // case5: middle
																// char is the
																// repeating
																// char
			{
				int newflag = 0;
				int newflag_double = 0;
				int newskipped = 0;
				for (i = 0, j = slen / 2 + 1; i < slen / 2 && j < slen; i++, j++) {
					if (str.charAt(i) != str.charAt(j)) {
						newflag = 1;
						break;
					}
				}
				if (newflag == 0) // subcase 5.1: middle char is removed and
									// resulting string is double string
				{
					System.out.print("YES\n");
					continue;
				}
				for (i = 0, j = slen / 2; i < slen / 2 && j < slen;) {
					if (str.charAt(i) == str.charAt(j)) {
						i++;
						j++;
						continue;
					} else {
						if (newskipped == 0) // 1 skip is allowed
						{
							if (str.charAt(j) == repeating_char) {
								newskipped++;
								j++;
								continue;
							} else // subcase 5.1.1:mismatch coz of the some
									// char other than repeating char which cant
									// be removed
							{
								newflag_double = 1;
								break;
							}
						} else // subcase 5.1.2:one char already skipped and
								// still a mismatch.more than one skips are not
								// allowed
						{
							newflag_double = 1;
							break;
						}
					}
				}
				if (newflag_double == 0) // subcase 5.1: middle char is removed
											// and resulting string is double
											// string
				{
					System.out.print("YES\n");
					continue;
				}
				newflag_double = 0;
				newskipped = 0;

				for (i = 0, j = (slen / 2) + 1; i <= slen / 2 && j < slen;) {
					if (str.charAt(i) == str.charAt(j)) {
						i++;
						j++;
						continue;
					} else {
						if (newskipped == 0) // 1 skip is allowed
						{
							if (str.charAt(i) == repeating_char) {
								newskipped++;
								i++;
								continue;
							} else // subcase 4.1:mismatch coz of the some char
									// other than repeating char which cant be
									// removed
							{
								newflag_double = 1;
								break;
							}
						} else // subcase 4.2:one char already skipped and still
								// a mismatch.more than one skips are not
								// allowed
						{
							newflag_double = 1;
							break;
						}
					}
				}
				if (newflag_double == 0) // subcase 5.1: middle char is removed
											// and resulting string is double
											// string
				{
					System.out.print("YES\n");
					continue;
				} else {
					System.out.print("NO\n");
					continue;
				}

			}
		}
		sc.close();
	}
}