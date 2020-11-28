package manager;

import domain.PostContent;

public class PostManager {
    private PostContent[] posts;

    public PostContent[] searchPost(int ownerId, String domain, String query, int ownersOnly, int count, int offset) {
        return null;
    }

    public void deletePost(int ownerId, int postId) {
    }

    public PostContent[] getPosts() {
        return posts;
    }

    public void setPosts(PostContent[] posts) {
        this.posts = posts;

        }
}
