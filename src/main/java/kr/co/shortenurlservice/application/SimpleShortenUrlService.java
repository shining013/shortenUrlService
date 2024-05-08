package kr.co.shortenurlservice.application;

import kr.co.shortenurlservice.domain.ShortenUrlRepository;
import kr.co.shortenurlservice.presentation.ShortenUrlCreateRequestDto;
import kr.co.shortenurlservice.presentation.ShortenUrlCreateResponseDto;
import org.springframework.stereotype.Service;

@Service
public class SimpleShortenUrlService {
    private ShortenUrlRepository shortenUrlRepository;

    SimpleShortenUrlService(ShortenUrlRepository shortenUrlRepository) {
        this.shortenUrlRepository = shortenUrlRepository;
    }
    public ShortenUrlCreateResponseDto generateShortenUrl(ShortenUrlCreateRequestDto shortenUrlCreateRequestDto) {
        return null;
    }
}
