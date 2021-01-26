#!/bin/bash
echo "Enter any two numbers"
read val1
read val2

sum=`expr $val1 + $val2`
echo "Their sum is $sum"
product=`expr $val1 \* $val2`
echo "Their product is $product"
divisor=`expr $val1 / $val2`
echo "Their divisor $divisor"
remainder=`expr $val1 % $val2`
echo "The remainder post division is $remainder"

if [ $val1 == $val2 ]
then
 echo "Values are equal"
else
 echo "Unequal"
fi

if [ $val1 -ne $val2 ]
then
 echo "Values are unequal"
else
 echo "Unequality condition fails"	
fi

if [ $val1 -lt $val2 ]
then
 echo "Val1 less than Val2"
else
 echo "Value1 not less than Value 2"       	
fi

if [ $val1 -ge $val2 ]
then 
 echo "Val1 greater than or equal to Val2"
else
 echo "Greater than equal to condition fails"
fi

if [ $val1 -le $val2 ]
then 
 echo "Val1 less than or equal to Val2"
else
 echo "Less than equal to condition fails"
fi

if [ $val1 = $val2 ]
then 
 echo "Equality criterion is true"
else
 echo "Equality condition is false"
fi

if [ $val1!=$val2 ]
then
 echo "Unequality criterion satisfied"
else
 echo "Unequality criterion fails"
fi

echo "Enter name"
read Name
if [ -z $Name ]
then
 echo "zero length string entered"
else
 echo "Non-zero length string entered"
fi

echo "Enter string"
read String
if [ -n $String ]
then
 echo "There is a string"
else 
 echo "There is none"
fi

echo "Enter a word"
read Word
if [ $Word ]
then
 echo "Word exists"
else
 echo "Nishabd"
fi 
