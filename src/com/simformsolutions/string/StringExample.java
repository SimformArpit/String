package com.simformsolutions.string;

public class StringExample {
    public static void main(String[] args) {
        String name = "Arpit";
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        stringBuffer.append(name)
                .append("\nSir : Good Morning")
                .append("\nArpit : Good Morning")
                .append("\nSir : how are you")
                .append("\nArpit : I am Fine");
        System.out.println(stringBuffer);


        System.out.println();
        StringBuilder stringBuilder = new StringBuilder("                sir : Introduce yourself " + name)
                .append("\nArpit : My name is Arpit. Currently i am pursing my BE in computer engineering from MBIT and Joined as an Java Developer in simformsolutions as Trainee")
                .append("\nMy hobbies are to play guitar also to play Cricket")
                .append("\nAs Talking about myself I have experience as SDE in Google and am also familiar with Java Technologies like Springboot, JPA, Hibernate.");
        System.out.println(stringBuilder);
        System.out.println();
        stringBuilder = new StringBuilder(stringBuilder.toString().toUpperCase());
        System.out.println(stringBuilder);
        System.out.println();
        System.out.println(stringBuilder.toString().trim());

    }


}
