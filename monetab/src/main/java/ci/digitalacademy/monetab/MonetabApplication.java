package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.*;
import ci.digitalacademy.monetab.service.*;
import org.hibernate.sql.ast.tree.expression.SqlTuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private AdressService adressService;

	@Autowired
	private FicheNoteService ficheNoteService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


//		FicheNote ficheNote1 = new FicheNote();
//		ficheNote1.setNote("20");
//		ficheNote1.setTeacher(teacher);
//		ficheNote1.setAnnee(Instant.now());
//		ficheNoteService.save(ficheNote1);
//
//		FicheNote ficheNote2 = new FicheNote();
//		ficheNote2.setNote("15");
//		ficheNote2.setTeacher(teacher1);
//		ficheNote2.setAnnee(Instant.now());
//		ficheNoteService.save(ficheNote2);



//		System.out.println(teacher);
//		System.out.println(ficheNote1);
//		System.out.println(ficheNote2);

		//		User user = new User( null, "Jinx", "123456", Instant.now(), adress);
////		User user1 = new User( null, "Violet", "234556", Instant.now());
//		userService.save(user);
//
//		System.out.println(adress);
//		System.out.println(user);


//		Address adress = new Address( null, "USA", "NY", "Bronx");
//		adressService.save(adress);

//		List<User> users = userService.findAll();
//		System.out.println(users);

//
//		FicheNote ficheNote = new FicheNote( null, "20", Instant.now(), new Teacher());
//		User user1 = new User( null, "Violet", "234556", Instant.now());
//		ficheNoteService.save(ficheNote);


//
//		System.out.println(teacher);
//		System.out.println(ficheNote);
//
//		Student student1 = new Student();
//		student1.setDateNaissance("1990");
//		student1.setMatricule("0111-976WE");
//		student1.setNom("Shelbi");
//		student1.setPrenom("Fin");
//		student1.setEmail("JuShel@mail.com");
//		student1.setTelephone("092-49884");
//
//		Student student2 = new Student();
//		student2.setDateNaissance("2003");
//		student2.setMatricule("MN98-976WE");
//		student2.setNom("Guerralt");
//		student2.setPrenom("Otto");
//		student2.setEmail("otto@mail.com");
//		student2.setTelephone("7809-49884");
//
//		Student student3 = new Student();
//		student3.setDateNaissance("2000");
//		student3.setMatricule("P008-976WE");
//		student3.setNom("Aline");
//		student3.setPrenom("Maiga");
//		student3.setEmail("aline@mail.com");
//		student3.setTelephone("0122-4984");
//
//		studentService.save(student1);
//		studentService.save(student2);
//		studentService.save(student3);
//
//		System.out.println(student1);
//		System.out.println(student2);
//		System.out.println(student3);



//		Teacher teacher = new Teacher();
//		teacher.setNom("Koff");
//		teacher.setPrenom("Don");
//		teacher.setEmail("donkof@mail.com");
//		teacher.setDateNaissance("1980");
//		teacher.setTelephone("105-08-238-112");
//		teacher.setMatiere("Histoire");
//		teacher.setMatiereEnseigne("Mathématiques");
//		teacher.setVaccant(true);
//		teacher.setSujetProchainCours("Politique");
//
//		Teacher teacher1 = new Teacher();
//		teacher1.setNom("Pathko");
//		teacher1.setPrenom("Man");
//		teacher1.setEmail("patkoman@mail.com");
//		teacher1.setDateNaissance("1970");
//		teacher1.setTelephone("221-09-234-332");
//		teacher1.setMatiere("ASSEMBLEUR");
//		teacher1.setMatiereEnseigne("JAVA");
//		teacher1.setVaccant(true);
//		teacher1.setSujetProchainCours("phylosophie");
//
//		teacherService.save(teacher);
//		teacherService.save(teacher1);



//		Address adress = new Address();
//		adress.setCity("Miami");
//		adress.setCountry("USA");
//		adress.setStreet("Bronx");
//
//
//		Address adress1 = new Address();
//		adress1.setCity("Tokyo");
//		adress1.setCountry("JAPAN");
//		adress1.setStreet("Konoya");
//
//
//		adressService.save(adress);
//		adressService.save(adress1);
//
//
//		User user = new User();
//		user.setPseudo("Jinx");
//		user.setCreationDate(Instant.now());
//		user.setAddress(adress);
//		user.setPassword("123@jinx");
//
//		User user1 = new User();
//		user1.setPseudo("Violet-vi");
//		user1.setCreationDate(Instant.now());
//		user1.setAddress(adress1);
//		user1.setPassword("viViolet01");
//
//		User user2 = new User();
//		user2.setPseudo("Powder");
//		user2.setCreationDate(Instant.now());
//		user2.setPassword("powderx1");
//
//
//		userService.save(user);
//		userService.save(user1);
//		userService.save(user2);




	}
}
