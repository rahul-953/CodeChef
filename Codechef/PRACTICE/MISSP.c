#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	scanf ("%d", &t);
	while (t--) {
	    int n, xor = 0;
	    scanf ("%d", &n);
	    while (n--) {
	        int k;
	        scanf ("%d", &k);
	        xor ^= k;
	    }
	    printf ("%d\n", xor);
	}
	return 0;
}
