package generics;

import generics.dao.GenericDAO;
import generics.dao.UserDAO;
import generics.domain.UserDomain;

public class Main {
    private static GenericDAO<Integer, UserDomain> dao = new UserDAO();

    public static void main(String[] args) {
        var user = new UserDomain(1, "João", 36);

        System.out.println(dao.count());
        System.out.println(dao.save(user));
        System.out.println(dao.findAll());
        System.out.println(dao.find(d -> d.getId().equals(1)));
        System.out.println(dao.find(d -> d.getId().equals(2)));
        System.out.println(dao.count());
        System.out.println(dao.delete(new UserDomain(-1, "", -1)));
        System.out.println(dao.delete(user));
        System.out.println(dao.findAll());
        System.out.println(dao.count());
    }

}
