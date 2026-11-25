day = "Sat"
match day:
    case "Sat" | "Sun":
        print("Weekend!")
    case _:
        print("Weekday!")