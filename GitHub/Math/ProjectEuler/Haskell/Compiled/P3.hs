primeFactors :: Integral a => a -> a -> [a]
primeFactors 1 _ = []
primeFactors num factor
        |num `mod` factor == 0  = factor : primeFactors (num `div` factor) factor
        |otherwise              = primeFactors num (factor + 1)
        
factorize :: Integer -> [Integer]
factorize number = primeFactors number 2

main = do
        print $ last (factorize 600851475143)