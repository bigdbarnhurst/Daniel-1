projectE9 = [(a, b, c) | a <- [1..500], b <- [1..a], let c = 1000 - a - b, a^2 + b^2 == c^2, a + b + c == 1000]
