public class YourInitials {
    public static void main(String[] args) {
        var name = "Dominique Hallan";
        // loop over the name and get the first letter and the first letter after a space. Create a new variable called initial that stores the initials
        var initial = name.charAt(0) + "" + name.charAt(name.indexOf(" ") + 1);
        System.out.println(initial);
    }
}
