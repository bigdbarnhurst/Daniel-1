import System.Environment (getArgs)

splitWords :: String -> [String]
splitWords sentence = 
	let (word1, ending) = break findSpaces sentence
	in word1 : case ending of
		(' ':rest)		-> splitWords rest
		_			-> []
findSpaces p = p == ' '

fixLines :: String -> String
fixLines input = unlines (splitWords input)

interactWith function inputFile outputFile = do
	input <- readFile inputFile
	writeFile outputFile (function input)

main = mainWith myFunction
	where mainWith function = do
		args <- getArgs
		case args of
			[input,output] -> interactWith function input output
			_-> putStrLn "error: exactly two arguments needed"
			
myFunction = fixLines