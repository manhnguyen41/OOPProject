package views;

import connector.KeyWordConnector;
import connector.RedditPostConnector;
import controller.KeyWordController;
import controller.RedditPostController;
import models.KeyWord;
import models.RedditPost;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<RedditPost> redditPostList = RedditPostConnector.
                readRedditPostsFromJson("C:\\Study\\OOPLT\\OOPProject\\data\\RedditPost.json");
        List<KeyWord> keyWordList = KeyWordConnector.getAllKeyWords(redditPostList);
        KeyWord keyWord = KeyWordController.getKeyWord("NFT Investment", keyWordList);
        assert keyWord != null;
        System.out.println(keyWord.getReact()[0]);
        List<RedditPost> redditPostList1 = RedditPostController.getRedditPostByKeyWord(redditPostList, "NFT Investment");
        for (RedditPost redditPost: redditPostList1) {
            System.out.println(redditPost.toString());
        }
    }
}
