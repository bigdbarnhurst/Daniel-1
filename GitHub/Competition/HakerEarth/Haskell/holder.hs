isSquare n = (truncate (sqrt (x))) * (truncate (sqrt (x))) == n
    where x = fromIntegral n

dipuCounter bottom top
        |upper = (truncate $ sqrt top) - (truncate $ sqrt bottom) + 2
        |lower  = (truncate $ sqrt top) - (truncate $ sqrt bottom) + 1
        |otherwise                       = (truncate $ sqrt top) - (truncate $ sqrt bottom)
        where upper = False
              lower = True
