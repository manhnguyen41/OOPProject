package connector;

import controller.ListOfRedditPosts;
import models.KeyWord;
import models.RedditPost;

import java.util.ArrayList;
import java.util.List;

public class KeyWordConnector extends Connector{
    // Static method to create a list of keywords of a list of reddit posts
    public static List<KeyWord> getAllKeyWords(ListOfRedditPosts listRedditPost) {
        List<String> listKeyWords = new ArrayList<>();

        for (RedditPost redditPost : listRedditPost.getRedditPostList()) {
            String keyword = redditPost.getKeyword();
            if (!listKeyWords.contains(keyword)) {
                listKeyWords.add(keyword);
            }
        }

        List<KeyWord> uniqueKeywords = new ArrayList<>();
        for (String keyWord: listKeyWords) {
            KeyWord newKeyWord = new KeyWord(keyWord);
            newKeyWord.calculateReact(listRedditPost);
            uniqueKeywords.add(newKeyWord);
        }

        return uniqueKeywords;
    }
}
