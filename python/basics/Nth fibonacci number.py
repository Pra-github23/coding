n = int(input("enter the number"))

first = 1
second = 1

if(n <= 2):
    print(1)
else:
    n -= 2

    s = 0
    while n != 0:
        s = first + second
        first = second
        second = s
        n -= 1
    print (s)
