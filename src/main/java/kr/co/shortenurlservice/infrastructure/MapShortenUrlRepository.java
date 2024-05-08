package kr.co.shortenurlservice.infrastructure;

import kr.co.shortenurlservice.domain.ShortenUrl;
import kr.co.shortenurlservice.domain.ShortenUrlRepository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapShortenUrlRepository implements ShortenUrlRepository {
    private Map<String, ShortenUrl> shortenUrls = new ConcurrentHashMap<>();

    public void saveShortenUrl(ShortenUrl shortenUrl) {
        shortenUrls.put(shortenUrl.getShortenUrlKey(), shortenUrl);
    }
}
