package kr.co.shortenurlservice.presentation;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ShortenUrlRestController {
    @RequestMapping(value = "/shortenUrl", method = RequestMethod.POST)
    public ResponseEntity<ShortenUrlCreateResponseDto> createShortenUrl( @Valid @RequestBody ShortenUrlCreateRequestDto shortenUrlCreateRequestDto) {
           return ResponseEntity.ok().body(null);
    }
    @RequestMapping(value = "/{shortenUrlKey}", method =  RequestMethod.GET)
    public ResponseEntity<?> redirectShortenUrl(@PathVariable String shortenUrlKey) {
        return ResponseEntity.ok().body(null);
    }
    @RequestMapping(value = "/shortenUrl/{shortenUrlKey}", method = RequestMethod.GET)
    public ResponseEntity<ShortenUrlInformationDto> getShortenUrlInformation(@PathVariable String shortenUrlKey) {
        return ResponseEntity.ok().body(null);
    }
}
