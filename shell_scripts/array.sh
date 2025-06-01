#!/bin/bash

name[0]="sai"
name[1]="srinu"
name[2]="sravani"
name[3]="maddy"

echo "zerothIndex : ${name[0]}"
echo "firstIndex : ${name[1]}"
echo "secondIndex : ${name[2]}"
echo "thirdIndex : ${name[3]}"

echo "printing array all at once with *"

echo ${name[*]}

echo "printing array all at once with @" 
echo ${name[@]}
