replicat :: Int -> a -> [a]
replicat n x
	|n <= 0 = []
	|otherwise = x:replicat (n-1) x

tak :: (Num i, Ord i) => i -> [a] -> [a]
tak n _
	| n <= 0 = []
tak _ []	 = []
tak n(x:xs) = x : tak (n-1) xs

revers :: [a] -> [a]
revers [] = []
revers (x:xs) = revers xs ++ [x]

zi :: [a] -> [b] -> [(a,b)]
zi _ [] = []
zi [] _ = []
zi (x:xs) (y:ys) = (x, y) : zi (xs) (ys)

