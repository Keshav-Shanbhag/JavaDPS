Activity 5: List and Set Interface (Java Collection Framework)

 

1. Problem on List

There are two lists which contains the names of players who were the top 5 scorers of two seasons 12 and 13 of IPL respectively. Write a program to find those players who have shown a consistent play in both the seasons. Precisely find the players who are on the list of top scorers in both the IPL seasons. Use retailAll method.

Input Format:

First 5 lines of the input contains the names of players who were the top scorers of IPL season 13.

Second 5 lines of the input contains the names of players who were the top scorers of IPL season 12.

Output Format:

Output should print the names of common players in both seasons line after line.

Sample Input and output:

Enter the top 5 scorers of IPL Season 13

KL Rahul

Shikhar Dhawan

David Warner

Shreyas Iyer

Ishan Kishan

Enter the top 5 scorers of IPL Season 12

David Warner

KL Rahul

Quinton De Kock

Shikhar Dhawan

Andre Russel

Consistent run scorers

David Warner

KL Rahul

Shikhar Dhawan

 

2. Problem on List 
Chris Gayle, at his best, is devastating and is all about power and brute force. He is the first player to have scored a century in international Twenty20 cricket; the only man to score more than 15 centuries in the Twenty20 format; and is the leading six-hitter in Twenty20s. 
 
Assume Gayle had played “n” matches in his Twenty20 career. Given a list with “n” elements containing the scores of Gayle in the “n” matches he had played. Write a program to find the number of 50's and 100's that Gayle had scored in all “n” matches. 
 
 Input Format: 
First line of the input is an integer “n” that corresponds to the number of matches Gayle had played. 
Next “n” lines contains an integer which corresponds to the score of Gayle in each of the matches. 
 
 Output Format: 
Output should display an integer in the first line that gives the number of 50's Gayle has scored. 
In the second line print the integer that corresponds to the number of 100's Gayle has scored. 
 
 Sample Input 
6 
58 
100 
49 
50 
110 
60 
 Sample Output 
3 
2

 

 

3. Problem on Set using HashSet

Display the count of players who have won the Player of the match title. The statistics should count only distinct players.

Write a program to get the number of matches ‘n’ and the players who have won the player of the match title in those ‘n’ matches in a list. Store them in a set and display the number of distinct players who have won the title.

Note: Use HashSet

Input  Format:

First line of the input corresponds the value of n, number of matches.

Next n+1 lines corresponds to the player names who have won player of the match title for those ‘n’ matches.

Output Format:

Output should display the count of distinct players who have won the title.

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output:

5

Virat Kohli

MS Dhoni

Rohit Sharma

Virat Kohli

Gautam Gambir

4

 

4. Player of the Match using Set Interface

Display name of the players who have won the Player of the match title. The statistics should contain only distinct players in sorted order. 
 
Write a program to get the number of matches ‘n’ and the players who have won the player of the match title in those ‘n’ matches in a list. Store them in a set and display the name of distinct players who have won the title in a sorted order. 
Note: Use TreeSet 
 Input  Format:​ 
First line of the input corresponds the value of n, number of matches.​ 
Next n+1 lines corresponds to the player names who have won player of the match title for those ‘n’ matches. 
 Output Format: 
Output should display the name of distinct players who have won the title in sorted order. 
Refer sample input and output for formatting specifications.​ 
​ 
 Sample Input :​ 
5 
Virat Kohli 
MS Dhoni 
Rohit Sharma 
Virat Kohli 
Gautam Gambir 
 Sample Output : 
Gautam Gambir 
MS Dhoni 
Rohit Sharma 
Virat Kohli
