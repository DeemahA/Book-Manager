package online.Deemah.exceptions;

public class dataSourceException extends Exception {

    public dataSourceException(String massage) {
        super(massage);

    }

    public dataSourceException(String massage, Throwable cause) {
        super(massage, cause);
    }

}
