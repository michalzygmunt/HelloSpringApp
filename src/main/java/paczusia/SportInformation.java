package paczusia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportInformation implements Information {
    //@Autowired
    //@Qualifier("sportBreakingNewsService")
    private BreakingNewsService breakingNewsService;
    @Value("${sport.name}")
    private String name;
    private String description;


    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public SportInformation(@Qualifier("sportBreakingNewsService") BreakingNewsService
                                    breakingNewsService) {
        this.breakingNewsService = breakingNewsService;
    }

    @Autowired
    @Qualifier("sportBreakingNewsService")
    public void setBreakingNewsService(BreakingNewsService breakingNewsService) {
        this.breakingNewsService = breakingNewsService;
    }

    @Override
    public String getInformation() {
        return "...sports news...";
    }

    public String getBreakingNews() {
        return breakingNewsService.getBreakingNews();
    }
}


