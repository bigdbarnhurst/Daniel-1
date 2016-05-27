oddFilter :: Integral a => [a] -> [a]
oddFilter xs = filter odd xs

oneLiner :: [String] -> IO ()
oneLiner xs = putStr ( unlines xs )

