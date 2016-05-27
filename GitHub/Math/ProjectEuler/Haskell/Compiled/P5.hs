leastCM :: Integral a => a -> a
leastCM x = foldr lcm 1 [1..x]

main = do
        print $ leastCM 20