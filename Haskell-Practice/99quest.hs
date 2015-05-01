myLast :: [a] -> a
myLast [] = error "List must have length"
myLast [x] = x
myLast (_:xs) = myLast xs
myButLast :: [a] -> a
myButLast [] = error "List must have length"
myButLast list = myLast (init list)
elementAt :: [a] -> Int -> a
elementAt [] _ = error "List must have length"
elementAt list position
	|position > 1  = elementAt (tail list) (position - 1)
	|position == 1 = head list