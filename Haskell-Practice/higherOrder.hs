quickSort :: (Ord a) => [a] -> [a]
quickSort [] = []
quickSort (x:xs) =
	let smallerOrEqual = [a | a <- xs, a <= x]
	    larger = [a | a <- xs, a > x]
	in  quickSort smallerOrEqual ++ [x] ++ quickSort larger

reverseSort :: (Ord a) => [a] -> [a]
reverseSort [] = []
reverseSort (x:xs) =
	let smallerOrEqual = [a | a <- xs, a <= x]
	    larger = [a | a <- xs, a > x]
	in  reverseSort larger ++ [x] ++ reverseSort smallerOrEqual

applyTwice :: (a -> a) -> a -> a
applyTwice f x = f (f x)

zipWit :: (a -> b -> c) -> [a] -> [b] -> [c]
zipWit _ [] _ = []
zipWit _ _ [] = []
zipWit f (x:xs) (y:ys) = f x y : zipWit f (xs) (ys)

flippy :: (a -> b -> c) -> b -> a -> c
flippy f y x = f x y

chain :: Integer -> [Integer]
chain 1 = [1]
chain n
	| even n = n:chain (n `div` 2)
	| odd n = n:chain (n*3+1)

numLongChains :: Int
numLongChains = length (filter isLong (map chain [1..100]))
	where isLong xs = length xs > 15

largestDivisible :: Integer -> [Integer] -> Integer
largestDivisible num list = head (filter p list)
	where p x = x `mod` num == 0

multi :: (Num a) => [a] -> a
multi lizz = foldl (\prod p -> prod * p) 1 lizz

sqrtSums :: (Enum a, Floating a, Ord a) => a -> Int
sqrtSums quest = length (takeWhile (<quest) (scanl1 (+) (map sqrt [1..]))) +1
