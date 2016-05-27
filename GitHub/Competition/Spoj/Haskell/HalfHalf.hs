halfSplitter :: [a] -> [a]
halfSplitter xs = take ((length xs) `div` 2) xs

numMix list1 = zip [1..length list1] list1

separator xs = filter((odd) . fst) xs

whatsLeft xs = map (snd) xs

mixUp xs = whatsLeft $ separator $ numMix $ halfSplitter xs

main = do
