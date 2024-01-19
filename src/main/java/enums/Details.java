package enums;

public enum Details {
    DEFAULT(null),
    UNHEALTY("вредную"),
    DINNER("На обед");

    private final String detail;

    Details(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return this.detail;
    }

    @Override
    public String toString() {
        return getDetail();
    }
}