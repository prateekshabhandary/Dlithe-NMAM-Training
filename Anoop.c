#include <stdio.h>

int main() {
    int n;
    printf("Enter the number of days: ");
    scanf("%d", &n);

    int count = n;
    int ways = 1;

    if (n < 2) {
        printf("1");
    }

    while (n > 1) {
        ways = ways * n;
        n--;
    }

    printf("There are %d different ways Anoop can meet his girlfriends in %d days.", ways, count);

    return 0;
}
