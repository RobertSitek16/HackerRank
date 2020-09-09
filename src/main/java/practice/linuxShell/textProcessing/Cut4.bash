Problem
Display the first four characters from each line of text.
BASH:
#!/bin/bash

while read input
do
echo $input | cut -c-4
done