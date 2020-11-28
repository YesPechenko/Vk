package domain;

public class LikeInfo {
    private int quantity;
    private boolean userLike;
    private boolean canLike;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

}
