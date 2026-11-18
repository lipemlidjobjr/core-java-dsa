# 1.1
a = 5
b = a
a = 7
print(a, b)

# 1.2
x = 10
y = x
print(x is y)
x += 1
print(x, y, x is y)

# 1.3
a = [1, 2]
b = a
a.append(3)
print(b)

# 1.4
a = [1, 2]
b = a
a = a + [3]
print(a, b)

# 1.5
a = [1, 2]
b = a
a += [3]
print(a, b)

# 1.6
a = [1, 2, 3]
b = [1, 2, 3]
c = a
print(a == b, a is b)
print(a == c, a is c)

# 1.7
s = "hello"
before = id(s)
s = s + "!"
print(id(s) == before)

# 1.8
a = 256; b = 256
print(a is b)
a = 1000; b = int("1000")
print(a == b, a is b)