fibonacci :: Int -> Integer
fibonacci n = fib!!n
        where fib = 0 : 1 : zipWith (+) fib (tail fib)