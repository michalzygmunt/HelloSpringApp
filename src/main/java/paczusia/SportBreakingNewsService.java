package paczusia;

import org.springframework.stereotype.Component;

@Component
public class SportBreakingNewsService implements BreakingNewsService {
    @Override
    public String getBreakingNews() {
        return "Poland wins fifa world cup";
    }
}
