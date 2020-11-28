package domain;

public class PostHeaderInfo {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageIdUrl() {
        return imageIdUrl;
    }

    public void setImageIdUrl(int imageIdUrl) {
        this.imageIdUrl = imageIdUrl;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(int postAuthor) {
        this.postAuthor = postAuthor;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private int id;
    private int imageIdUrl;
    private int name;
    private int postAuthor;
    private long date;
    private long time;
}
