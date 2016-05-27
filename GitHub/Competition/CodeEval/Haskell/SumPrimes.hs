import Data.List

primeSieve1 :: Integral a => [a] -> [a]
primeSieve1 [] = []
primeSieve1 (x:xs) = x : primeSieve1 [p | p <- xs, p `mod` x > 0]

primeList :: [Integer]
primeList = 2 : primeSieve1 [3,5..] 

sumPrimes n = sum $ take n primeList

main = do
        print $ sumPrimes 1000