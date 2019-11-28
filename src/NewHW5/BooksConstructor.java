package NewHW5;

class BooksConstructor {

	private int id, year, numberOfPages, prise;
	private String name, autor, publishing, bildingType;

	public BooksConstructor(int id, String name, String autor, String publishing, int year, int numberOfPages,
			int prise, String bildingType) {

		this.id = id;
		this.name = name;
		this.autor = autor;
		this.publishing = publishing;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.prise = prise;
		this.bildingType = bildingType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAutor() {
		return autor;
	}

	public String getPublishing() {
		return publishing;
	}

	public int getYear() {
		return year;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public int getPrise() {
		return prise;
	}

	public String getBildingType() {
		return bildingType;
	}

	@Override
	public String toString() {
		return "Книга id: " + id + "; Название книги: " + name + "; Автор(ы): " + autor + "; Издательство: "
				+ publishing + "; Год издания: " + year + "; Количество страниц: " + numberOfPages + "; Цена: " + prise
				+ " грн." + "; Тип переплета: " + bildingType + ".";
	}
}
