package Task9;

public class NovelGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }
}
