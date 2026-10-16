import random

rolls = 10000
counts = {1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0}

for i in range(rolls):
	result = random.randint(1, 6)
	counts[result] = counts[result] + 1

for face in counts:
	probability = counts[face] / rolls
	print(face, "appeared", counts[face], "times, probability:", probability)
