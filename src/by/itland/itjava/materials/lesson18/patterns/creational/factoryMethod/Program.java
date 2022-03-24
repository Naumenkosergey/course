package by.itland.itjava.materials.lesson18.patterns.creational.factoryMethod;

public class Program {
    public static void main(String[] args) {
//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeCode();
//
//        CppDevaloper cppDevaloper = new CppDevaloper();
//        cppDevaloper.writeCode();

//        Developer developer = new CppDevaloper();
//        developer.writeCode();

        DeveloperFactory developerFactory = createDeveloperBySpecialty("cpp");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
        DeveloperFactory developerFactory2 = createDeveloperBySpecialty("java");
        Developer developer2 = developerFactory2.createDeveloper();
        developer2.writeCode();
        DeveloperFactory developerFactory3 = createDeveloperBySpecialty("php");
        Developer developer3 = developerFactory3.createDeveloper();
        developer3.writeCode();
        DeveloperFactory developerFactory4 = createDeveloperBySpecialty("C#");
        Developer developer4 = developerFactory4.createDeveloper();
        developer4.writeCode();

    }

    //метод абстрактной фабрика "Фабричный бетод"
    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        switch (specialty.toLowerCase()) {
            case "java":
                return new JavaDeveloperFactory();
            case "cpp":
                return new CppDevrloperFactory();
            case "php":
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException(specialty + " is unknown speciality.");
        }
    }
}
