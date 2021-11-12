public class Animal {
    int modelYear;
    String modelName;
    
    public Animal(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        Animal obj = new Animal(1996, "Adnaan");
        System.out.println(obj.modelName + " " + obj.modelYear);
    }
}    
      
