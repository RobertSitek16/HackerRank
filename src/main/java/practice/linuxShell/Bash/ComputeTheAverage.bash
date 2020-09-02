Problem
Given N integers, compute their average, rounded to three decimal places.
BASH:
#!/bin/bash

read n
sum=0
for(( i=0; i<n; i++ ))
{
    read number
    sum=$(( sum+number ))
}
printf "%.3f" $(echo "$sum/$n" | bc -l)