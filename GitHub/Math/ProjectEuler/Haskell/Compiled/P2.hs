fibonacci :: Int -> Integer
fibonacci top = (fib !! top)
        where fib = 0 : 1 : zipWith (+) fib (tail fib)

evenSum :: Integer -> Integer
evenSum limit = sum (takeWhile (< limit) (filter even [fibonacci x | x <- [1..]]))

main = do
        print $ evenSum 4000000