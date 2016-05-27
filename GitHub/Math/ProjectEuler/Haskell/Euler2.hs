fibonacci :: Int -> Integer
fibonacci n = fib!!n
        where fib = 0 : 1 : zipWith (+) fib (tail fib)

evenFibSum :: Integer -> Integer
evenFibSum limit = sum (takeWhile ( < limit) (filter (even)  [fibonacci x | x <- [1..]]))