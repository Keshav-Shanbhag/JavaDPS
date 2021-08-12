Day 1: Activity 1

Problem 1:

Ramya got salary for the current month and she spends 20% of her salary for food and 30% of her salary for travel. If she takes care of other shifts she will get 2% of the salary per day. Given her salary and the number of shifts she handled. Calculate how much she can save in her pocket after spending all these?
 
 Input and Output Format :
First line of input consists of an integer, salary. Next line correspond to the number of shifts. Output consist of an integer, which is saving.
 
1) Print "Salary too large" when salary is greater than 8000.
2) Print "Shifts too small" when the shift is less than 0.
3) Print "Salary too small" when the salary is less than 0.
 
Include a function/method named calculateSal(int salary, int shifts) whose return type is an integer, which is the saving.
 
 Sample Input 1:
7000
5
 Sample Output 1:
4200
 
 Sample Input 2:
8001
 
 Sample Output 2:
Salary too large

Problem 2:

Ramesh is working as a clerk in an organization where N number of people are working. His boss has asked him to get the count of employees who get same salary. Help him to get the count of repeated salary.

Include a static method named countRepeaters that accepts 2 arguments and returns an int. The first argument is the input array and the second argument is an int that corresponds to the size of the array. The function returns an int that corresponds to the number of repeaters.

If the size of the array is negative or if any of the array elements are negative, print “Invalid Input” and terminate the program.

Input and Output Format:

Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.

Output consists of an integer that corresponds to the number of repeaters.

Assume that utmost one element in the array would repeat.

Assume that the maximum number of elements in the array is 20.

Sample Input 1:

5

1000

2000

3500

2000

5000

Sample Output 1:

2

Sample Input 2:

-5

Sample Output 2:

Invalid Input

Sample Input 3:

5

1000

-2000

Sample Output 3:

Invalid Input

Problem 3:

In a car racing video game, the car is an object. You can drive the car, turn the car, or stop the car when needed but you need to drive long. You will get money according to the Km you have travelled. For example if you have travelled 123 km then the product of the km (ie 1*2*3 = 6) would be the amount you win. Write a program to find the product of the digits in the given input number.

Include a instance method named productDigits that accepts an integer argument and returns an integer that corresponds to the product of digits in the integer.

The function returns -1 if the input number is negative or greater than 32767.

If the function returns -1, print Invalid Input.

Input and Output Format:

Input consists of an integer.

Output consists of an integer.

Refer sample output for formatting specifications.

Sample Input 1:

32

Sample Output 1:

6

Sample Input 2:

-67

Sample Output 2:

Invalid Input

Problem 4:

In an organization, there are some managers working on two different projects (Medical and Health care). When the feedback was taken their feedback was present in both Medical Feedback as well as Health care Feedback. Write a method to create a consolidated feedback for the managers for Medical and Health care. For those working on both the projects the highest feedback is taken. In the 2 given arrays, the First Index represents the Employee id and second one Represents The Feed Back Score and so on....
 
 Input and Output Format:
First line corresponds to n, the size of the array. The next n lines correspond to the elements of the first array. The next n lines correspond to the elements in the second array. Output corresponds to the consolidated feedback score.
 
1) Print "Invalid array size" when size of the array is a negative number and terminate the program
2) Print "Invalid input" when there is any negative number available in the input array and terminate the program
 
Include a method named highestFeedBack(int medical[],int healthcare[],int size) whose return type is void.
The output array is stored in a global variable named feedback.
 
 Sample Input 1:
8
1
90
2
75
3
92
5
85
1
80
2
85
3
80
4
85
 Sample Output 1:
1
90
2
85
3
92
5
85
4
85
 
 Sample Input 2:
5
5
8
9
1
-6
 Sample Output 2:
Invalid number
 
 Sample Input 3:
-4
 Sample Output 3:
Invalid array size
