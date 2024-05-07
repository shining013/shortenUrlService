package kr.co.shortenurlservice.presentation;

import kr.co.shortenurlservice.domain.ShortenUrl;

public class ShortenUrlCreateResponseDto {
    private String originalUrl;
    private String shortenUrlKey;

    public ShortenUrlCreateRequestDto(ShortenUrl shortenUrl) {
        this.originalUrl = shortenUrl.getOriginalUrl();
        this.shortenUrlKey = shortenUrl.getShortenUrlKey();
    }
    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortenUrlKey() {
        return shortenUrlKey;
    }
}
