factorial :: Integer -> Integer
factorial x = product [1..x]

perm :: Integer -> Integer -> Integer
perm total selected = (factorial total) `quot` (factorial (total - selected))

comb :: Integer -> Integer -> Integer
comb total selection = (factorial total) `quot` ((factorial (total - selection)) * factorial selection)