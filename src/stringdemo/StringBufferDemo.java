package stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pune ");
        stringBuffer.append("is a city");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Mumbai");
        stringBuffer.append(" is a capital of India");
        System.out.println(stringBuilder);
    }
}


