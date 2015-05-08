project1 :: Integral a => a -> a
project1 top = sum [x | x <- [1..(top-1)], x `mod` 3 == 0 || x `mod` 5 == 0]

main = do
       print $ project1 1000