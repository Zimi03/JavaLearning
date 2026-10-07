public class Exercise4 {
    public static void main(String[] args){
        int age = 18;
        boolean hasLicense = true;
        boolean canDrive = age >= 18 && hasLicense;
        System.out.println("age: " + age + " has license: " + hasLicense + " can drive: " + canDrive);
        age = 18;
        hasLicense = false;
        canDrive = age >= 18 && hasLicense;
        System.out.println("age: " + age + " has license: " + hasLicense + " can drive: " + canDrive);
        age = 17;
        hasLicense = false;
        canDrive = age >= 18 && hasLicense;
        System.out.println("age: " + age + " has license: " + hasLicense + " can drive: " + canDrive);
        age = 17;
        hasLicense = true;
        canDrive = age >= 18 && hasLicense;
        System.out.println("age: " + age + " has license: " + hasLicense + " can drive: " + canDrive);
    }
}