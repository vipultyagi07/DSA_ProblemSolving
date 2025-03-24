package topics.recursion;

public class R9_GCD {
    public static void main(String[] args){

        System.out.println(gcd(24,36));
    }

    /**
     * Calculates the GCD of two numbers using recursion.
     * <p>
     * <img src="https://ih1.redbubble.net/image.5083378990.0966/raf,360x360,075,t,fafafa:ca443f4786.u3.jpg" alt="Portrait of Euclid" width="200"/>
     * </p>
     * <p>
     *  <h6>PREREQUISITE</h6>Study Euclidean Algorithm first
     * </p>
     * <p>
     * <b>Example:</b>
     * <pre>
     * I/P: 24,36
     * O/P: 12
     * </pre>
     * </p>
     * <p>
     * For more details, refer to:
     * <a href="https://drive.google.com/file/d/1SRMHbW0jfpSzHGxQSTzdtm0iuzFEVE26/view?usp=sharing" target="_blank">For Visualization</a>.
     * </p>
     *
     */

    private static int gcd(int a, int b) {

        if(b==0){
            return a;
        }

        return gcd(b,a%b);
    }
}
