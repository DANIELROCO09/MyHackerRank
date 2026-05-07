"""
Problem:https://www.hackerrank.com/challenges/py-if-else/problem?isFullScreen=true
Complex: O(n)
Goal: Read an integer N,if N is odd,print 'Weird'.if N es even and in the
inclusive range of 2 yo 5,print 'Not Weird'.If N is even and in the inclu-
sive range of 6 to 20,print 'Weird'. If N is even and greater than 20,print
'Not weird'"""
if __name__ == '__main__':
    n = int(input().strip())
    if n%2!=0:
        print("Weird")
    else:
        if n>=2 and n<=5:
            print("Not Weird")
        elif n>=6 and n<=20:
            print("Weird")
        elif n>=20:
            print("Not Weird")
