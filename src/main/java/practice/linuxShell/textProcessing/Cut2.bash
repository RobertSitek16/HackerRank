Problem
Display the second and seventh character from each line of text.
BASH:
#!/bin/bash

while read input
do
echo $input | cut -c2,7
done