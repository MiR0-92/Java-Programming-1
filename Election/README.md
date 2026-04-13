Write a program Election that computes the tally in a write-in election, and
announces the winner. Since the votes are write-in, there is no pre-determined set of
candidates. Whoever appears the most in the votes is the winner. The user enters the
individual votes, one vote per line, and ends entering with typing -1 or an empty line. To
Page 9 of 8
compute the tally, the program uses two arrays, a String [ ] variable (names), and an int
[ ] variable (count). Upon receiving a single vote, the program checks if the name on the
vote appears in names, and if it does, the program adds 1 to the value of the element in
count. If the name does not appear in names, the program extends both arrays by one
element, stores the name in names at the last position and store 1 in count at the last
position. In this manner, the two arrays will have the same lengths. The initial length is 0
for both arrays.

Course Work Task 4 Updated to Object-Oriented Model.