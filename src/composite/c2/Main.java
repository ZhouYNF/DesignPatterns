package composite.c2;


/**
 *组合模式：通过多态，抽象的方式将他们的类型都做成相同的，然后通过聚合的方式，都给组合起来；
 */
public class Main {
    public static void main(String[] args) {
        OrganizationComponent university = new University("大学A", "ccccccc");

        OrganizationComponent computerCollege = new College("学院A", " 学院A ");
        OrganizationComponent infoEngineercollege = new College("学院B", " 学院A ");


        computerCollege.add(new Department("专业A", " AA "));
        computerCollege.add(new Department("专业B", " AA "));
        computerCollege.add(new Department("专业C", " AA "));

        infoEngineercollege.add(new Department("专业c", "ddd"));
        infoEngineercollege.add(new Department("专业d", "cccccc "));

        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.print();
    }
}