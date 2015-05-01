primeFactorGenerator :: (Integral t) => t -> t -> [t]
primeFactorGenerator 1 _ = []
primeFactorGenerator n factor
        |n `mod` factor == 0 = factor : primeFactorGenerator (n `div` factor) (factor)
        |otherwise           = primeFactorGenerator n (factor + 1)

primeFactorize :: Integral t => t -> [t]
primeFactorize n = primeFactorGenerator n 2