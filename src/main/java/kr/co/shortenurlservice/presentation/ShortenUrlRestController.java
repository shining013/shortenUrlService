package kr.co.shortenurlservice.presentation;

import jakarta.validation.Valid;
import kr.co.shortenurlservice.application.SimpleShortenUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShortenUrlRestController {
    private SimpleShortenUrlService simpleShortenUrlService;

    @Autowired
    ShortenUrlRestController(SimpleShortenUrlService simpleShortenUrlService) {
        this.simpleShortenUrlService = simpleShortenUrlService;
    }

    @RequestMapping(value = "/shortenUrl", method = RequestMethod.POST)
    public ResponseEntity<ShortenUrlCreateResponseDto> createShortenUrl( @Valid @RequestBody ShortenUrlCreateRequestDto shortenUrlCreateRequestDto) {
           ShortenUrlCreateResponseDto shortenUrlCreateResponseDto =
                   simpleShortenUrlService.generateShortenUrl(shortenUrlCreateRequestDto);
           return ResponseEntity.ok(shortenUrlCreateResponseDto);
    }

    @RequestMapping(value = "/{shortenUrlKey}", method =  RequestMethod.GET)
    public ResponseEntity<?> redirectShortenUrl(@PathVariable String shortenUrlKey) {
        return ResponseEntity.ok().body(null);
    }
    @RequestMapping(value = "/shortenUrl/{shortenUrlKey}", method = RequestMethod.GET)
    public ResponseEntity<ShortenUrlInformationDto> getShortenUrlInformation(@PathVariable String shortenUrlKey) {
        ShortenUrlInformationDto shortenUrlInformationDto =
                simpleShortenUrlService.getShortenUrlInformationByShortenUrlKey(shortenUrlKey);
        return ResponseEntity.ok(shortenUrlInformationDto);
    }
}
