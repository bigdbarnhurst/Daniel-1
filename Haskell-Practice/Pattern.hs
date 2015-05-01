sumList :: [Int] -> Int
sumList (x:xs) = x + sumList xs
sumList [] = 0