package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class App {

	public static void main(String[] args) {
		
		Class books[] = new Class[15];
		books[0] = new Class("Мастер и маргарита",  "Михаил Булгаков", 500, 11);
		books[1] = new Class("Война и мир",  "Война и мир", 5030, 5);
		books[2] = new Class("Преступление и наказание",  "Федор Достоевский", 984, 17);
		books[3] = new Class("Анна Каренина",  "Лев Толстой", 57650);
		books[4] = new Class("Метро 2033",  "Дмитрий Глуховский", 1230, 50);
		books[5] = new Class("Дубровский", "Александр Пушкин", 450, 78);
		books[6] = new Class("Идиот",  "Федор Достоевский", 1280, 47);
		books[7] = new Class("12 стульев",  "Илья Ильф и Евгений Петров", 647, 9);
		books[8] = new Class("Маленький принц",  "Антуан де Сент-Экзюпери", 1257, 4);
		books[9] = new Class("Мастерство программирования",  "Дональд Кнут", 978, 7);
		books[10] = new Class("Властелин колец",  "Дж. Р. Р. Толкин", 1875, 45);
		books[11] = new Class("Гарри Поттер",  "Джоан Роулинг", 1574, 34);
		books[12] = new Class("1984",  "Джордж Оруэлл", 19844);
		books[13] = new Class("Моя жизнь в рекламе",  "Клод Хопкинс", 14560, 12);
		books[14] = new Class("Три товарища",  "Эрих Мария Ремарк", 1570);
		
		for (int i = 0; i < books.length; i++) {
			int j_max = i;
			for (int j = i +1; j < books.length; ++j) {
				if (books[j_max].edition < books[j].edition) {
					j_max = j;
				}
			}
			Class temp = books[i];
			books[i] = books[j_max];
			books[j_max] = temp;
		}
		try {
			PrintStream out = new PrintStream(new File("C:\\\\Users\\\\Элеонора\\\\eclipse-workspace\\\\lab1\\\\src\\\\data.txt.txt"));
			for (Class book : books) {
				book.printToFile(out);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		for (int i = 0; i < books.length; i++) {
			int j_max = i;
			for (int j = i +1; j < books.length; ++j) {
				if (books[j_max].price < books[j].price) {
					j_max = j;
				}
			}
			Class temp = books[i];
			books[i] = books[j_max];
			books[j_max] = temp;
		}
		try {
			PrintStream out = new PrintStream(new File("C:\\Users\\Элеонора\\eclipse-workspace\\lab1\\src\\data_price.txt.txt"));
			for (Class book : books) {
				book.printToFile(out);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}