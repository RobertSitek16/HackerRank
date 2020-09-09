Problem
A mathematical expression containing +,-,*,^, / and parenthesis will be provided. Read in the expression, then evaluate it.
Display the result rounded to 3 decimal places.
BASH:
#!/bin/bash

read num
echo $num | bc -l | xargs printf "%.3f"