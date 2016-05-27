sumSquare :: (Enum t, Num t) => t -> t
sumSquare top = (sum [x | x <- [1..top]])^2 - sum [x^2 | x <- [1..top]]

main = do
        print $ sumSquare 100