package Task9;

public class StoryGenre extends GenreByNumberOfPages {

    @Override
    public String getGenreName() {
        return GenreEnum.STORY.name();
    }
}
