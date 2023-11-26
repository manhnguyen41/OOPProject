import io.github.redouane59.twitter.TwitterClient;
import io.github.redouane59.twitter.dto.tweet.Tweet;
import io.github.redouane59.twitter.dto.user.User;
import io.github.redouane59.twitter.signature.TwitterCredentials;

import java.io.File;

public class TwitterApiExample {

    public static void main(String[] args) {
        TwitterClient twitterClient = new TwitterClient(TwitterCredentials.builder()
                .accessToken("1727349854643568640-rqYuFSqsXiUHSwrsznTwGZQaiwf2m7")
                .accessTokenSecret("4dPpVej2hfDHMiTXoEwAJ7ERQh4VsNWvRQgsHthKv8pyt")
                .apiKey("aZlkdoqDLvGIKrSWNiIbK6JzO")
                .apiSecretKey("DuF7aAK0YYq5SBiUt2TDIXpdGsuPPjiHcxNVhnmcBPZFZCH5GK")
                .build());

        User user = twitterClient.getUserFromUserName("spotify");
        System.out.println(user.getName());
        System.out.println(user.getDisplayedName());
        System.out.println(user.getDateOfCreation());
        System.out.println(user.getDescription());
        System.out.println(user.getTweetCount());
        System.out.println(user.getFollowersCount());
        System.out.println(user.getFollowingCount());
        System.out.println(user.getPinnedTweet());
        System.out.println(user.getPinnedTweet());
        System.out.println(user.getLocation());
        System.out.println(user.getId());
        System.out.println(user.getUrl());

    }
}

