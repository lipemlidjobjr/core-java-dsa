surname = str(input("What's your surname? "))
name = str(input("What're your names? "))
nationality = str(input("What's your nationality? "))
yearOfBirth = int(input("What year were you born in? "))

if yearOfBirth > 2008:
    print("You're of leagal age!")
else:
    print("You're NOT of legal age..")