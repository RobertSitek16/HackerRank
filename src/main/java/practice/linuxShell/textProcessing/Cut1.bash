Problem
Given N lines of input, print the 3 character from each line as a new line of output. It is guaranteed that each of the n
lines of input will have a 3 character.
BASH:
#!/bin/bash

while read input
do
echo $input | cut -c3-3
done