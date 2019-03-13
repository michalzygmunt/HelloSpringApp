package paczusia;

public class WeatherInformation implements Information {

    private BreakingNewsService breakingNewsService;

    public WeatherInformation(){};

    public WeatherInformation(BreakingNewsService breakingNewsService) {
        this.breakingNewsService = breakingNewsService;
    }

    public String getBreakingNews(){
        return breakingNewsService.getBreakingNews();
    }

    @Override
    public String getInformation() {
        return "\"weather\":[{\"id\":800,\"Main\":\"Clear\",\"description\":\"Sky is Clear\",\"icon\":\"01n\"}],\n";}

}
