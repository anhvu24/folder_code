#include <stdio.h>
#include <cs50.h>
#include <cs50.c>

int main(void)
{
    
    string name = get_string("","Whats is your name? ");
    int age = get_int("What is your age? ");
    string number = get_string("","What is your phome number? ");

    printf("Name: %s, Age: %d, Number: %s", name, age, number);


}
