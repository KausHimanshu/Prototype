public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student aprBatch = new Student();
        aprBatch.setBatch("April 22");
        aprBatch.setAverageBatchPsp(88.39);

        studentRegistry.register("april22Batch", aprBatch);

        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("April 22");
        is.setAverageBatchPsp(88.0);
        is.setIq(180);

        studentRegistry.register("April22IntelligentBatch",is);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student ganesh = studentRegistry.get("april22Batch").clone();
        ganesh.setName("Ganesh");
        ganesh.setAge(21);
        ganesh.setPsp(91.0);

        Student kartikey = studentRegistry.get("April22IntelligentBatch").clone();
        kartikey.setName("Kartikey");
        kartikey.setAge(22);
        kartikey.setPsp(92.0);

        System.out.println("DEBUG");
    }
}