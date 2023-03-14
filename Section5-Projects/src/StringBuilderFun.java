

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Doug Turcotte");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(4, "las Jeffrey");
        System.out.println(sb);

        sb.replace(28, 35, "amazing");
        System.out.println(sb);

        sb.delete(4, 15);
        System.out.println(sb);

        sb.replace(0, 4, "Mr.");
        System.out.println(sb);

    }//end main
}
