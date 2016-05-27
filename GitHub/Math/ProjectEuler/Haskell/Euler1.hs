projectE1 :: Integer -> Integer
projectE1 x = sum [ x | x <- [1..(x - 1)], x `mod` 3 == 0 || x `mod` 5 == 0]