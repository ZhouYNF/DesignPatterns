package composite.c2;

/**
 * 专业，专业已经时最低层了，所以可以不用再细分
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName()+"==================="+getDes());
    }
}
