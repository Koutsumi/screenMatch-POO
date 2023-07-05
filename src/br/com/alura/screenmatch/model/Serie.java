package screenMatch.model;

public class Serie extends Title{

    private int seasons;
    private boolean active;
    private int episodes;
    private int episodeTime;

    public Serie(String title, int year) {
        super(title, year);
    }


    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodeTime() {
        return episodeTime;
    }

    public void setEpisodeTime(int episodeTime) {
        this.episodeTime = episodeTime;
    }

    @Override
    public int getTime() {
        return seasons * episodes * episodeTime;
    }
}
