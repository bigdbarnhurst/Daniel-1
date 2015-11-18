test = int(input())
for x in range(test):
        t1, t2, t3, t4 = input().split()
        t1 = int(t1)
        t2 = int(t2)
        t3 = int(t3)
        t4 = int(t4)
        prob = t1 / (t1 + t2)
        print(prob)