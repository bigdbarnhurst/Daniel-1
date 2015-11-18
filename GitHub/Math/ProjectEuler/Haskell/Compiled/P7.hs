import Data.List

primeLister :: Integral a => [a] -> [a]
primeLister [] = []
primeLister (x:xs) = x : primeLister [p | p <- xs, p `mod` x > 0]

primeList :: [Integer]
primeList = 2 : primeLister [3,5..]

primeRank :: Int -> Integer
primeRank n = primeList !! (n - 1)

main = do
        print $ primeRank 10001