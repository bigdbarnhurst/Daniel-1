import System.IO

trailingZeros num
    |num `mod` 10 == 0 = 1 + trailingZeros (num `div` 10)
    |otherwise         = 0
factorial num = product [1..num]

main = do
    begin <- getLine
    let next = read begin :: Int
    let fact = factorial next
    let zeros = trailingZeros fact
    print zeros
