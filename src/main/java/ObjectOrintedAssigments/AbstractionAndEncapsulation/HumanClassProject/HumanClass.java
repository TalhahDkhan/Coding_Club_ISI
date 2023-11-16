package ObjectOrintedAssigments.AbstractionAndEncapsulation.HumanClassProject;

public class HumanClass {
private String language;
private double height;
private double weight;

HumanClass(String language){
    this.language = language;
}
HumanClass(String language, double height, double weight){
    this.language = language;
    this.height = height;
    this.weight = weight;
}
private void setHeight(double height){
    this.height = height;
}
private void setWeight(double weight){
    this.weight = height;
}
public  String getLanguage() {
    return language;
}

public double getHeight() {
    return height;
}
public double getWeight(){
    return weight;
}
public String getAttributes(){
    return "\nLanguage is"+language+"\n height is "+height+"\nWeight is"+ weight;
}
}
