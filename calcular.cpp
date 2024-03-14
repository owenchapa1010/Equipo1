#include <iostream>
using namespace std;

const int MAX_ROWS = 10;
const int MAX_COLS = 10;

void printMatrix(int matrix[MAX_ROWS][MAX_COLS], int rows, int cols) {
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

void addMatrices(int matrix1[MAX_ROWS][MAX_COLS], int matrix2[MAX_ROWS][MAX_COLS], int rows, int cols) {
    int result[MAX_ROWS][MAX_COLS];
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    cout << "Suma de matrices:" << endl;
    printMatrix(result, rows, cols);
}

void subtractMatrices(int matrix1[MAX_ROWS][MAX_COLS], int matrix2[MAX_ROWS][MAX_COLS], int rows, int cols) {
    int result[MAX_ROWS][MAX_COLS];
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            result[i][j] = matrix1[i][j] - matrix2[i][j];
        }
    }
    cout << "Resta de matrices:" << endl;
    printMatrix(result, rows, cols);
}

void multiplyMatrices(int matrix1[MAX_ROWS][MAX_COLS], int matrix2[MAX_ROWS][MAX_COLS], int rows1, int cols1, int cols2) {
    int result[MAX_ROWS][MAX_COLS];
    for (int i = 0; i < rows1; ++i) {
        for (int j = 0; j < cols2; ++j) {
            result[i][j] = 0;
            for (int k = 0; k < cols1; ++k) {
                result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }
    cout << "Multiplicación de matrices:" << endl;
    printMatrix(result, rows1, cols2);
}

int main() {
    int rows1, cols1, rows2, cols2;

    cout << "Ingrese el número de filas y columnas de la primera matriz: ";
    cin >> rows1 >> cols1;
    cout << "Ingrese el número de filas y columnas de la segunda matriz: ";
    cin >> rows2 >> cols2;

    if (cols1 != rows2) {
        cout << "No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz." << endl;
        return 1;
    }

    int matrix1[MAX_ROWS][MAX_COLS], matrix2[MAX_ROWS][MAX_COLS];

    cout << "Ingrese los elementos de la primera matriz:" << endl;
    for (int i = 0; i < rows1; ++i) {
        for (int j = 0; j < cols1; ++j) {
            cin >> matrix1[i][j];
        }
    }

    cout << "Ingrese los elementos de la segunda matriz:" << endl;
    for (int i = 0; i < rows2; ++i) {
        for (int j = 0; j < cols2; ++j) {
            cin >> matrix2[i][j];
        }
    }

    addMatrices(matrix1, matrix2, rows1, cols1);
    subtractMatrices(matrix1, matrix2, rows1, cols1);
    multiplyMatrices(matrix1, matrix2, rows1, cols1, cols2);

    return 0;
}
