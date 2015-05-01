factorial :: Integer -> Integer
factorial x = product [1..x]

digitSum :: Integral a => a -> a
digitSum 0 = 0
digitSum x = (x `mod` 10) + digitSum (x `div` 10)

factorialSum :: Integer -> Integer
factorialSum x = digitSum (factorial x)