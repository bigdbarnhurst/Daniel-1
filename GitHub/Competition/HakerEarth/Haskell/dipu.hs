squareList :: (Enum b, Floating b) => b -> [b]
squareList start = map (^2) [1..top]
    where top = sqrt start

interestingNum :: (Enum a, Eq a, Floating a) => a -> Bool
interestingNum num = num `elem` squareList num

listChecker :: (Enum a, Eq a, Floating a) => a -> a -> Int
listChecker bottom top = length $ filter (interestingNum) ([bottom..top])
