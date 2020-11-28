package domain;

public class PostContent {
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLink() {
        return link;
    }

    public void setLink(int link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isCanAddImage() {
        return canAddImage;
    }

    public void setCanAddImage(boolean canAddImage) {
        this.canAddImage = canAddImage;
    }

    public boolean isCanAddAudio() {
        return canAddAudio;
    }

    public void setCanAddAudio(boolean canAddAudio) {
        this.canAddAudio = canAddAudio;
    }

    public boolean isCanAddVideo() {
        return canAddVideo;
    }

    public void setCanAddVideo(boolean canAddVideo) {
        this.canAddVideo = canAddVideo;
    }

    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }

    private int postId;
    private int ownerId;
    private String text;
    private int link;
    private String imageUrl;
    private boolean canAddImage;
    private boolean canAddAudio;
    private boolean canAddVideo;
    private boolean registeredUser;
}

