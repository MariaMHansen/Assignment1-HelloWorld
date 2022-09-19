public class Assignment1Tasks {
    // Write a public static function `sayHello` that returns "hello world!"
    // Add Your Code Here ...
    public static String sayHello(){
            return "hello world!";
        }
    public static int countDogs(String phrase) {
        int count = 0;
        for(int i = 0; i < phrase.length()-2; i ++){
            String sub = phrase.substring(i,i+3);
            if("dog".equals(sub)){
                count++;
            }
        }
        return count;
    }
    }
