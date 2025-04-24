

permutation = int(input("Put in a positive integer greater than or equal to 2: "))

if permutation >= 2:
    for i in range(1, permutation + 1):
        for j in range(1, permutation + 1):
            if i != j:
                print(f"({i}, {j})")
else:
    print("Invalid output")