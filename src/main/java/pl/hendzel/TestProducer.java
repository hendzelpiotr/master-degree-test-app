package pl.hendzel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("words")
@RestController
class TestProducer {

    @GetMapping
    public Response produceRandomStrings() {
        ArrayList<String> randomWords = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String generatedString = RandomStringUtils.randomAlphabetic(10);
            randomWords.add(generatedString);
        }
        return new Response(randomWords);
    }

    static class Response {
        List<String> words;

        public Response(List<String> words) {
            this.words = words;
        }

        public List<String> getWords() {
            return words;
        }
    }

}
