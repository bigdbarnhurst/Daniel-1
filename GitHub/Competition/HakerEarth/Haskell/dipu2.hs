isSquare n = (truncate (sqrt (x))) * (truncate (sqrt (x))) == n
    where x = fromIntegral n

bottomSquare bottom= (truncate (sqrt (x))) * (truncate (sqrt (x))) == bottom
    where x = fromIntegral bottom

topSquare top = (truncate (sqrt (x))) * (truncate (sqrt (x))) == top
    where x = fromIntegral top

bothSquare lower upper = bottomSquare lower && topSquare upper

oneSquare lower upper = bottomSquare lower || topSquare upper

dipuCounter lower upper
            | bothSquare lower upper = (truncate $ sqrt top) - (truncate $ sqrt bottom) + 2
            | oneSquare lower upper  = (truncate $ sqrt top) - (truncate $ sqrt bottom) + 1
            | otherwise              = (truncate $ sqrt top) - (truncate $ sqrt bottom)
            where top = upper
                  bottom = lower
