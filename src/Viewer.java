import java.util.Objects;

public class Viewer {
   private String name; //инкапсуляция
   private int age;
   // Constructor
   public Viewer(String name, int age) {
       this.name = name;
       this.age = age;
   }

   // Getters and Setters

   public String getName() {
       return name;
   }
   public int getAge() {
       return age;
   }
   public void setName(String name) {
       this.name = name;
   }
   public void setAge(int age) {
       this.age = age;
   }
   // tos show viewer information


    // Override toString() method
   @Override
   public String toString() {
       return "Viewer{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
   }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Viewer viewer = (Viewer) obj;
        return age == viewer.age && name.equals(viewer.name);
    }


    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
