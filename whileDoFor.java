//while loop
int count = 0;
while (count < 10) {
    System.out.println(count);
    count++;
}


//do loop is same as while loop, but it always runs at least once
int count = 0;
do {
    System.out.println(count);
    count++;
} while(count < 10);


//for - initialize, test, update
int count;
for(count = 0 ; count < 10 ; count++)
    System.out.println(count);

//multiple initilaizers declared
for(int i = 0, j = 10 ; i < 10 ; i++, j--)
    sum += i * j;

//foreach
// These are the numbers we want to print
int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
// This is the loop that prints them
for(int n : primes)
    System.out.println(n);
    