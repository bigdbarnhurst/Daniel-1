primeSieve2 (x:xs) = x : primeSieve2 (filter (\n -> n `mod` x > 0) xs)
              
primeList :: [Integer]
primeList = 2 : primeSieve2 [3,5..]

nthPrime :: Int -> Integer
nthPrime n = primeList !! (n - 1)