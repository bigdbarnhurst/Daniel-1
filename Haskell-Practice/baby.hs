doubleMe x = x + x
doubleUs x y = x * 2 + y * 2
doubleSmallNumber x = if x < 100
						then x * 2
						else x / 2
palindrome x = x == reverse x
removeNonUppercase :: [Char] -> [Char]
removeNonUppercase st = [ c | c <- st, c `elem` ['A'..'Z']]
circumference :: Double -> Double
circumference r = 2 * pi * r
palindrome1 :: Integer -> Bool
palindrome1 x = (show x) == reverse (show x)
factorial :: Integer -> Integer
factorial x = product [1..x]
third :: [a] -> a
third (_:_:x:_) =  x
bmi :: Double -> Double -> String
bmi weight height 
	| x <= 18.5 = "Give that man a sandwich!"
	| x <= 25.0 = "Great job, keep it up!"
	| x <= 30.0 = "Weight Watchers is calling your name."
	| otherwise = "Good gracious, you must be a fat as me!"
	where x = (weight / height^2) * 703
grade :: Integer -> String
grade af
	| af >= 90 = "The letter grade you recieve is: A"
	| af >= 80 = "The letter grade you recieve is: B"
	| af >= 70 = "The letter grade you recieve is: C"
	| af >= 60 = "The letter grade you recieve is: D"
	| af < 60 = "The letter grade you recieve is: F"