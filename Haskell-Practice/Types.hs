data Tree a = Node a (Tree a) (Tree a)
	    | Empty
	    deriving (Show)

pluralise :: String -> [Int] -> [String]
pluralise word counts = map plural counts
	where {plural 0 = "no " ++ word ++ "s";
	      plural 1 = "one " ++ word;
	      plural n = show n ++ " " ++ word ++ "s"}

myLength :: [a] -> Double
myLength [] = 0
myLength (x:xs) = 1 + myLength xs

mean :: [Double] -> Double
mean xs = (sum xs)/myLength xs

palindromeCreator :: [a] -> [a]
palindromeCreator xs = xs ++ reverse xs

palindromeTest :: Eq a => [a] -> Bool
palindromeTest xs
	|xs == (reverse xs)   = True
	|otherwise            = False

lineToVector :: (Num t, Num t1, Num t2) => (t, t1, t2) -> (t, t1, t2) -> (t, t1, t2)
lineToVector (x1,y1,z1) (x2,y2,z2) = (x2 - x1, y2 - y1, z2 - z1)

dotProduct :: Num a => (a, a, a) -> (a, a, a) -> a
dotProduct (vx1,vy1,vz1) (vx2,vy2,vz2) = vx1*vx2 + vy1*vy2 + vz1*vz2

vectorLength :: Floating a => (a, a, a) -> a
vectorLength (vx, vy, vz) = sqrt(vx^2 + vy^2 + vz^2)

pointsToAngle :: Floating a => (a, a, a) -> (a, a, a) -> (a, a, a) -> a
pointsToAngle a b c = (acos ((dotProduct (lineToVector a b) (lineToVector b c)) / (vectorLength (lineToVector a b) * vectorLength (lineToVector b c))))*180/pi