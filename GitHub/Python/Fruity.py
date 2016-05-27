import math

def compare(x, y):
	 if(x > y):
		 return 1
	 elif(x == y):
		 return 0
	 else:
		 return (-1)
def distance(x1, x2, y1, y2):
	answer = math.sqrt((x2 - x1) ** 2 +(y2 - y1) ** 2)
	return answer

def hypotenuse(leg1, leg2):
	answer = math.sqrt(leg1 ** 2 + leg2 ** 2)
	return answer

def circle_area(x1, x2, y1, y2):
	radius = distance(x1, x2, y1, y2)
	area = (radius ** 2) * math.pi
	return area

def is_between(x, y, z):
	return (x <= y <= z)