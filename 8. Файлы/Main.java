package file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
   //«Tекстовый редактор» с возможностью сохранения набранного текста в файл
    
		try (Scanner textscan = new Scanner(System.in)) {

			File file = new File("Текстовый редактор.txt");
			System.out.println("Введите текст >");
			String text = textscan.nextLine();
			
			System.out.println("Текст добавлен в файл " + file);

			try (PrintWriter pw = new PrintWriter(file)) {

				pw.println(text);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
