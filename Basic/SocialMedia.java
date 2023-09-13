interface SocialMediaIntegration{
    void sharePost();
    void likepost();
}

class FacebookIntegration implements SocialMediaIntegration{
    @Override
    public void sharePost(){
        System.out.println("Facebook --- > share post");
    }

    @Override
    public void likepost(){
        System.out.println("Facebook -- > like post");
    }
}
class TwitterIntegration implements SocialMediaIntegration{
    @Override
    public void sharePost(){
        System.out.println("Twitter --- > share post");
    }

    @Override
    public void likepost(){
        System.out.println("Twitter -- > like post");
    }
}
public class SocialMedia {
   public static void main(String[] args) {
        FacebookIntegration f = new FacebookIntegration();
        f.sharePost();
        f.likepost();

        TwitterIntegration t = new TwitterIntegration();
        t.sharePost();
        t.likepost();
   } 
}
/*
Scenario 6: Social Media Integration
Create an interface called "SocialMediaIntegration" with methods like "sharePost" and "likePost." Implement classes like "FacebookIntegration" and "TwitterIntegration" that provide specific implementations for these interface methods.
 */