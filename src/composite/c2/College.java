package composite.c2;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public class College extends OrganizationComponent {


    List<OrganizationComponent> organizationComponents = new ArrayList<>();


    public College(String name, String des) {
        super(name, des);

    }


    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }


    @Override
    protected void remove(OrganizationComponent organizationComponent) {

        organizationComponents.remove(organizationComponent);
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

        System.out.println("--------------" + getName() + "--------"+getDes()+"------");

        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }


}
