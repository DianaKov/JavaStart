package file;

import java.io.File;

public class Main3 {

	public static void main(String[] args) {
    
		File folder = new File("Catalogs");
		folder.mkdirs();
		catalogs(folder);
	}
	
	public static void catalogs(File folder) {
  //Метод выводит на экран всех каталогов расположенных в каталоге адрес которого будет параметром этого метода
    
		File[] file = folder.listFiles();
		for (int i = 0; i < file.length; i++) {
			if (file[i].isDirectory()) {

				System.out.println(file[i]);
			}
		}

	}

}
