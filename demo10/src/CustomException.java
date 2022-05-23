/**
 * @author 本当迷
 * @Description
 * @date 2022/5/23-13:39
 */
public class CustomException extends Exception{
    static final long serialVersionUID = -3387516993124229948L;


    public CustomException() {
        super();
    }


    public CustomException(String message) {
        super(message);
    }


    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }


    protected CustomException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
