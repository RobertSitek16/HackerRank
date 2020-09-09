Problem
Display a range of characters starting at the second position of a string and ending at the seventh position (both positions included).
BASH:
#!/bin/bash

while read input
do
echo $input | cut -c2-7
done