package topics.recursion;

public class R18_PrintAllSubsequence {

    public static void main(String[] args) {
        String inputString = "abcw";

        printSubset(inputString,"");
    }


    /**
     * print all Subset of a string using recursion's Input output method .
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: "abc"
     * O/P: "" ,"a" ,"b" ,"c" ,"ab" ,"bc" ,"ac"
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1pfHLWFRGp4qssYL91JGrslktTKD7sMu5/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     */
    private static void printSubset(String inputString, String output) {

        if(inputString.isEmpty()){
            System.out.println(output);
            return;
        }
        String output1 = output;
        String output2 = output;

        output2 = output2+inputString.charAt(0);
        inputString= inputString.substring(1);

        printSubset(inputString,output1);
        printSubset(inputString,output2);



    }
}
