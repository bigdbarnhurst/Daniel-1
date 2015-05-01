def print_me():
	print("Daniel")
	print("Jared")
	print("Barnhurst")
	print("bigdbarnhurst@gmail.com")
	print("702-541-1852")
	
def print_dad():
	print("Randy")
	print("Clair")
	print("Barnhurst")
	print("rbarnhurst@gmail.com")
	print("702-528-7021")

def print_both():
	print_me()
	print(" ")
	print_dad()

def right_justify(bob):
	x = len(bob)
	y = 70 - x
	print(" " * y + bob)