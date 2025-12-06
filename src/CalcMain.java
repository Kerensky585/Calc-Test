


public class CalcMain {

    public static int NUMA;
    public static int NUMB;

    public static void main(String[] args) {
        NUMA = 5;
        NUMB = 5;
        System.out.println("Hello, World!");
        int result = addNumbers(NUMA, NUMB);
        System.out.println("You added: " + NUMA + " with, " + NUMB + "\nTotal is: " + result);
    }

    /**
     * addNumbers - adds two integer numbers together, return result.
     * @param numa integer    number
     * @param numb integer number
     * @return int total
     */
    public static int addNumbers(int numa, int numb){
        return numa + numb;
    }
}