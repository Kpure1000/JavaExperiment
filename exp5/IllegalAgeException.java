/**
 * IllegalAgeException
 * 
 * @author 8208-1803-01 匡涂上青
 * @version 1.0
 */
public class IllegalAgeException extends Exception {
    private String Message;

    /**
     * 构造
     * 
     * @param msg 消息
     */
    public IllegalAgeException(String msg) {
        Message = msg;
    }

    /**
     * 获取异常消息
     * 
     * @return 消息
     */
    public String getMessage() {
        return Message;
    }

    /**
     * 年龄超出范围异常
     */
    public static class OutOfRange extends IllegalAgeException {

        /**
         *
         */
        private static final long serialVersionUID = -7879580834383520219L;

        /**
         * 传入异常消息
         * 
         * @param msg 异常消息
         */
        public OutOfRange(String msg) {
            super(msg);
        }
    }
}