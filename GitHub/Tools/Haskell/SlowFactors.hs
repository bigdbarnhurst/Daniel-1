slowFactors :: Integer -> [Integer]
slowFactors n = [ x | x <- [1..n], n `mod` x == 0]