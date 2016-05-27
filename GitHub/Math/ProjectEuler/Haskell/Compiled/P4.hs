palinProd = maximum [z | x <- [100..999], y <- [100..999], let z = (x * y), let pal = show z, pal == reverse pal]

main = do
        print $ palinProd