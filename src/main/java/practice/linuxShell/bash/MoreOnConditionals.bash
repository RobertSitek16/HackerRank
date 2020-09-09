Problem
Given three integers (x, y, and z) representing the three sides of a triangle, identify whether the triangle is scalene,
isosceles, or equilateral.
- If all three sides are equal, output EQUILATERAL.
- Otherwise, if any two sides are equal, output ISOSCELES.
- Otherwise, output SCALENE.
BASH:
#!/bin/bash

read x
read y
read z
if [ $x = $y ] && [ $y = $z ]
then
    echo "EQUILATERAL"
elif [ $x = $y ] || [ $x = $z ] || [ $z = $y ]
then
    echo "ISOSCELES"
else
    echo "SCALENE"
fi