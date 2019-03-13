package paczusia;

public class MusicInformation implements Information {
    private BreakingNewsService breakingNewsService;
    private String name;
    private String description;
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    @Override
    public String getInformation() {
        return "chart of top 2019 songs : ... ";
    }
    public void setBreakingNewsService(BreakingNewsService breakingNewsService)
    {
        this.breakingNewsService = breakingNewsService;
    }
    public String getBreakingNews() {
        return breakingNewsService.getBreakingNews();
    }
}
