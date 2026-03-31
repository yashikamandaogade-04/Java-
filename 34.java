class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
            // simulate error
            int x = 5/0;
        } catch(Exception e) {
            System.out.println("Error reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}
