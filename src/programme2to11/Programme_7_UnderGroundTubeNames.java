package programme2to11;

import java.util.ArrayList;

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty() {
        ArrayList<String> tubeName = new ArrayList<>();
        tubeName.add("Bakerloo_lines");
        tubeName.add("Central_lines");
        tubeName.add("Circle_lines");
        tubeName.add("District_lines");
        tubeName.add("Hammersmith_and_City lines");
        tubeName.add("Jubilee_lines");
        tubeName.add("Metrolpolitian_lines");
        tubeName.add("Northern_lines");
        tubeName.add("Piccdilly_lines");
        tubeName.add("Victoria_lines");
        tubeName.add("Waterloo_and_City_lines");

        System.out.println("Given Array List : " + tubeName);
        if(tubeName.isEmpty()){
            System.out.println("Given Array List is Empty!!");
    } else {
        System.out.println("Given Array List is not Empty!!");
    }

}

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}