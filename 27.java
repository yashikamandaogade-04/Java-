class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(6,"Java ");
        sb.reverse();
        System.out.println("Final String: " + sb);
    }
}
