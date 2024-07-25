// Say we have a population of n llamas. Each year, n / 3 new llamas are born, and n / 4 llamas pass away.




#include <stdio.h>
#include <cs50.h>
#include <cs50.c>


int main(void)
{
    // prompting user for a starting number
    int start_llamas;
    do
    {
        start_llamas = get_int("Input start llamas: ");
    } while (start_llamas < 9);
    


    // prompting user for a ending number
    int end_llamas;
    do
    {
        end_llamas = get_int("Input end llamas: ");
    } while (end_llamas < start_llamas);
    

    // how many years to get goal? 
    // Every year +1/3 number; -1/4 number
    int year;

    for (year = 0; start_llamas < end_llamas; year++)
    {
        start_llamas = start_llamas + start_llamas/3 - start_llamas/4;
    }
    printf("Year: %d", year);
    
}