
rows = int(input("How many rows are in the matrix? "))
columns = int(input("How many columns are in the matrix? "))

matrix1 = []

for rownum in range(1, rows + 1):
    row = []
    for columnnum in range(1, columns + 1):
        value = int(input(f'Type in the value for {rownum}{columnnum} '))
        row.append(value)
    matrix1.append(row)


rows2 = int(input("How many rows are in the second matrix? "))
columns2 = int(input("How many columns are in the second matrix? "))

matrix2 = []

for rownum in range(1, rows2 + 1):
    row2 = []
    for columnnum in range(1, columns2 + 1):
        value = int(input(f'Type in the value for {rownum}{columnnum} '))
        row2.append(value)
    matrix2.append(row2)


add_matrix = []
if (rows == rows2) and (columns == columns2):
    for i in range(rows):
        row3 = []
        for j in range(columns):
            row3.append(matrix1[i][j] + matrix2[i][j])
        add_matrix.append(row3)
    print(add_matrix)
else:
    print("The matrices are not the same size.")
 