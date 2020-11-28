package domain;

public class PostContent {
    private int postId;
    private int ownerId;
    private String text;
    private int isPinned;
    private boolean markedAsDds;
    private int link;
    private String imageUrl;
    private String canAddImage;
    private String canAddAudio;
    private String canAddVideo;
    private boolean registeredUser;

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

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public boolean markedAsDds() {
        return markedAsDds;
    }

    public void setMarkedAsDds(boolean markedAsDds) {
        this.markedAsDds = markedAsDds;
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

    public String getCanAddImage() {
        return canAddImage;
    }

    public void setCanAddImage(String canAddImage) {
        this.canAddImage = canAddImage;
    }

    public String getCanAddAudio() {
        return canAddAudio;
    }

    public void setCanAddAudio(String canAddAudio) {
        this.canAddAudio = canAddAudio;
    }

    public String getCanAddVideo() {
        return canAddVideo;
    }

    public void setCanAddVideo(String canAddVideo) {
        this.canAddVideo = canAddVideo;
    }


    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }


}

