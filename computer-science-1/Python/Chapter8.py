numVertices = int(input("Enter the number of vertices: "))

print("Now enter the symmetric matrix of the graph row by row, seperated by a space: ")

matrix = []

for i in range(numVertices):
    row = list(map(int, input().split()))
    matrix.append(row)

degree1 = sum(matrix[0])
isRegular = True

for i in range(1, numVertices):
    if sum(matrix[i]) != degree1:
        isRegular = False
        break

if isRegular == True:
    print("The graph is regular.")
else:
    print("The graph is not regular.")