package zc1;

/**
 * @Author: zcc
 * @Created_on: 2022/5/27/13:34
 * ./JingLi.java
 */
public class JingLi extends Handler{
    @Override
    public boolean handle(Request req) {
        System.out.println("超过两天以上，经理同意申请");
        return true;
    }
}
