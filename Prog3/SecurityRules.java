package transport;
public final class SecurityRules {
    private SecurityRules() { }  // prevent instantiation
    public static boolean canFly(String place) {
        if (place.equalsIgnoreCase("ExamCell")) {
            return false;
        }
        return true;
    }}
