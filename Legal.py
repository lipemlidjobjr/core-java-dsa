surname = str(input("What's your surname? "))
name = str(input("What're your names? "))
nationality = str(input("What's your nationality? "))
yearOfBirth = int(input("What year were you born in? "))

age = 2026 - yearOfBirth

if nationality == "Cameroonian":
    if age >= 21:
        print("{surname} is of legal age!")
    else:
        print("{surname} is NOT of legal age..")
elif nationality != "Cameroonian":
    if age >= 18:
        print("{surname} is not from Cameroon, but you're of legal age!")
    else:
        print("{surname} is NOT from Cameroon, and you're NOT of legal age..")
else:
    print("Sorry, {surname}, your nationality isn't recognized.")