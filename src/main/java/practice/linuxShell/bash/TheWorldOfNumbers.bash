Problem
Given two integers, x and y, find their sum, difference, product, and quotient.
BASH:
#!/bin/bash

read x
read y
sum=$(( $x + $y ))
echo $sum
difference=$(( $x - $y ))
echo $difference
product=$(( $x * $y ))
echo $product
quotient=$(( $x / $y ))
echo $quotient