Problem
Given two integers, x and y, identify whether x < y or x > y or x = y.
Exactly one of the following lines:
- X is less than Y
- X is greater than Y
- X is equal to Y
BASH:
#!/bin/bash

read x
read y
if [[ $x > $y ]]
then
    echo "X is greater than Y"
elif [[ $x = $y ]]
then
    echo "X is equal to Y"
else
    echo "X is less than Y"
fi