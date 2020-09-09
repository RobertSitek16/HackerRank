Problem
Your task is to use for loops to display only odd natural numbers from 1 to 99.
BASH:
#!/bin/bash

for (( i=1; i<=99; i++ ))
{
    if (( i%2==1 ))
    then
        echo $i
    fi
}