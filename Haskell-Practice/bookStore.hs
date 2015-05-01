data BookInfo = Book Int String [String]
		 deriving (Show)

bookID (Book id title authors) = id
bookTitle (Book id title authors) = title
bookAuthors (Book id title authors) = authors

data MagazineInfo = Magazine Int String [String]
		     deriving (Show)

myInfo = Book 236632 "The Book of Daniel" ["Daniel Barnhurst", "Randy Barnhurst"]

type CustomerID = Int
type ReviewBody = String
type CardHolder = String
type CardNumber = Int

type Address = [String]

data BookReview = BookReview BookInfo CustomerID ReviewBody

data BillingInfo = CreditCard CardHolder CardNumber Address
		 | CashOnDelivery
		 | Invoice CustomerID
		   deriving (Show)