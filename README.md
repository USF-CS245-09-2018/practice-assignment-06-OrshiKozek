# CS 245 (Fall 2018) Practice Assignment 06

See assignment details on Canvas.


I implemented the methods of ArrayQueue and ArrayStack as required.

In Practice06Test.java, I changed the isPalendrome() method in order to recognize mixed-case and phrasal palindromes.
To get rid of the issue of capital vs lowecase letters, I changed the value of item to all lowercase by using the
toLowerCase() method of the String class. I also removed all non-alphabetic characters from item, using the replaceAll() method.
I had to look up how to remove all these non-alphabetic characters online: https://stackoverflow.com/questions/11149759/remove-all-non-alphabetic-characters-from-a-string-array-in-java