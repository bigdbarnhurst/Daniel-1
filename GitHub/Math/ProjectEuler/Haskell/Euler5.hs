projectE5 :: Integral b => b -> b
projectE5 x = foldr lcm 1 [1..x]