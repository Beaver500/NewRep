package Task16_TreeMap.Task;

public class Patent {
    private String number;
    private String company;
    private String author;
    private int year;
    private String description;

    public Patent(String number, String company, String author, int year, String description) {
        this.number = number;
        this.company = company;
        this.author = author;
        this.year = year;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return number + " " + company + " " + author + " " + year + " " + description;
    }
}
