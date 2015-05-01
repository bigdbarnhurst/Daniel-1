import Data.Char

splitLines :: String -> [String]
splitLines [] = []
splitLines cs =
	let (pre, suf) = break isLineTerminator cs
	in pre : case suf of
	       ('\r':'\n':rest) -> splitLines rest
	       ('\r':rest)      -> splitLines rest
	       ('\n':rest)      -> splitLines rest
	       _		-> []
isLineTerminator c = c == '\r' || c == '\n'

splitWords :: String -> [String]
splitWords sentence = 
	let (word1, ending) = break findSpaces sentence
	in word1 : case ending of
		(' ':rest)		-> splitWords rest
		_			-> []
findSpaces p = p == ' '

listSquare :: [Integer] -> [Integer]
listSquare [] = []
listSquare (x:xs) = x*x : listSquare xs

upperList :: String -> String
upperList [] = []
upperList (x:xs) = toUpper x : upperList xs

concatfoldr :: [[a]] -> [a]
concatfoldr xs = foldr (++) [] xs

myTakeWhile :: (a -> Bool) -> [a] -> [a]
myTakeWhile f (x:xs) 
        |f x       = x : myTakeWhile f xs
        |otherwise = []
        
myFoldTakeWhile :: (a -> Bool) -> [a] -> [a]
myFoldTakeWhile f xs = foldr step [] xs
        where step x acc  |f x       = x : acc
                           |otherwise = []

myAny :: (a -> Bool) -> [a] -> Bool
myAny test (x:xs) = foldr step False xs
        where step x acc = test x || acc

