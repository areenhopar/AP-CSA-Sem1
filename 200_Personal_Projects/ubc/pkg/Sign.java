import java.util.*;

class Sign {
    String message;
    int width;
    
    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }
    
    public int numberOfLines() {
        int len = message.length();
        
        return Math.ceil(len / width);
    }
}