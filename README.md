# MultitreadingExample
OOP Homework that I hope teaches me about multithreading

### Problem 1

* Create **n** threads, each sleeps for a random amount of time between 1 and 10 seconds, then displays its sleep time and exits.
* Prompt the user to input n.

### Problem 2

* Solve a cross tunnel problem using priority mechanism. 
* There are 10 people who wants to go through a tunnel.
* Each time only one person can go through the tunnel and it takes 5 seconds (using **sleep()** to simulate). When one person has crossed, he/she prints the name out.
* The priority is determined alphabetically (e.g., a person named "abc" has a priority higher than "xyz").
* Create 10 people with randomly generated names, and let them go through a tunnel.

### Problem 3

* Solve a single producer, single problem using **wait()** and **notifyAll().**
* The producer must not overflow the shared buffer, which can happen if the producer is faster than the consumer. If the consumer is faster than the producer, then it must not read the same data more than once. Do not assume anything about the relative speeds (i.e., random producing and consuming speeds) of the producer or consumer.