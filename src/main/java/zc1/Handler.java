package zc1;

/**
 * @Author: zcc
 * @Created_on: 2022/5/27/13:31
 * ./Handler.java
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract boolean handle(Request req);
}
