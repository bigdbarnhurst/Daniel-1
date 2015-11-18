import Data.List

primeSieve1 :: Integral a => [a] -> [a]
primeSieve1 [] = []
primeSieve1 (x:xs) = x : primeSieve1 [p | p <- xs, p `mod` x > 0]

primeList :: [Integer]
primeList = 2 : primeSieve1 [3,5..]

primeSummit :: Integer -> [Integer]
primeSummit top = takeWhile (<top) primeList

isPalindrome :: Integer -> Bool
isPalindrome number = z == reverse z
        where z = show number
              
primePalindrome (x:xs) = maximum $ filter (isPalindrome) xs

main = do
        print $ primePalindrome $ primeSummit 1000