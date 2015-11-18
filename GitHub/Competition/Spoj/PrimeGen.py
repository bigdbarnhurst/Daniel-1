test = int(input())
cases = range(test)
for x in cases:
        bottum = int(input())
        top = int(input())
        sieve = list(range(bottum, top + 1, 1))
        prime_list = []
        for i in sieve:
                if sieve == []:
                        break
                else:
                        if sieve[0] not in prime_list:
                                prime_list.append(sieve[0])
                        sieve = list(filter((lambda x : x % i != 0), sieve))
        print(prime_list)