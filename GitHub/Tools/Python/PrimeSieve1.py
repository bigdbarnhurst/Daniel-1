def primes_below(n):
        sieve = list(range(3, n, 2))
        prime_list = [2]
        for i in sieve:
                if sieve == []:
                        break
                else:
                        if sieve[0] not in prime_list:
                                prime_list.append(sieve[0])
                        sieve = list(filter((lambda x : x % i != 0), sieve))
        return prime_list