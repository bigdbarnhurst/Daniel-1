sumSquareDiff :: Integer -> Integer
sumSquareDiff x = (sum [1..x])^2 - sum (map (^2) [1..x])