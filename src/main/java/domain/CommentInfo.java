package domain;

public class CommentInfo {
    private int quantity;
    private int userCommentId;
    private String textComment;
    private String imageCommentUrl;
    private String audioCommentUrl;
    private String videoCommentUrl;
    private int date;
    private boolean canClose;
    private boolean canOpen;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserCommentId() {
        return userCommentId;
    }

    public void setUserCommentId(int userCommentId) {
        this.userCommentId = userCommentId;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public String getImageCommentUrl() {
        return imageCommentUrl;
    }

    public void setImageCommentUrl(String imageCommentUrl) {
        this.imageCommentUrl = imageCommentUrl;
    }

    public String getAudioCommentUrl() {
        return audioCommentUrl;
    }

    public void setAudioCommentUrl(String audioCommentUrl) {
        this.audioCommentUrl = audioCommentUrl;
    }

    public String getVideoCommentUrl() {
        return videoCommentUrl;
    }

    public void setVideoCommentUrl(String videoCommentUrl) {
        this.videoCommentUrl = videoCommentUrl;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }



}
