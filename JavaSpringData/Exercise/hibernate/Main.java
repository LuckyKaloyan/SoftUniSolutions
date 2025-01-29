package bg.softuni;


import bg.softuni.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();

//        Student student = new Student();
//        student.setName("Hiber");
//
//        currentSession.persist(student);

     Student student = currentSession.get(Student.class,0);
        System.out.println(student);


        currentSession.getTransaction().commit();
        currentSession.close();


    }
}