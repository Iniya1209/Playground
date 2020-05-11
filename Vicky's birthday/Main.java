#include<iostream>
#include <stdio.h>
int main() {
    int year;
    scanf("%d", &year);
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0)
                printf("Vicky can celebrate his birthday.");
            else
                printf("Vicky can't celebrate.");
        } else
            printf("Vicky can celebrate his birthday.");
    } else
        printf("Vicky can't celebrate.");

    return 0;
}