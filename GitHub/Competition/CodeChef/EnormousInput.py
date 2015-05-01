cases = int(input())
divisor = int(input())
success = 0
for x in range(cases):
        num = int(input())
        if (num % divisor == 0):
                success += 1
print(success)