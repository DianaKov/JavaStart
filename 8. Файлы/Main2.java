package file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main2 {
	public static void main(String[] args) {
		// Двухмерный массив целых чисел сохраняем в текстовый файл
		int[][] array =  new int[][] { { 1, 2, 3, 4}, { 5, 6, 7, 8 } };
		File file = new File("Two-dimensional array.txt");
		writeArray(file, array);
	}

	public static void writeArray(File file, int[][] array) {
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					pw.print(array[i][j] + " ");
				}
				pw.println();
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
