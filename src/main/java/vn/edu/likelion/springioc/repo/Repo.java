package vn.edu.likelion.springioc.repo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class Repo {

    public Repo() {
        System.out.println("Khoi tao RepoSMS");
    }

    public void print(String message) {
        System.out.println("Repository message: " + message);
    }
}
