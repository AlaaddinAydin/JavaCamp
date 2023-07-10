package oopIntro;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainerManager trainerManager = new TrainerManager();
		
		Trainer trainer1 = new Trainer(1,"Engin");
		Trainer trainer2 = new Trainer(2,"Ahmet");
		
		Courses courses1 = new Courses(1,"Kodlama", trainer1);
		Courses courses2 = new Courses(2, "Yemek", trainer2);
		
		Courses[] courses = {
				courses1,
				courses2
		};
		
		for (Courses course : courses) {
			System.out.println("Kategori ismi : " + course.name + " Eğitmen ismi : " + course.trainer.name );
		}
		
		
		
		Trainer[] trainers = {
				trainer1,
				trainer2
		};
		
		for (Trainer trainer : trainers) {
			System.out.println("Eğitmen ismi: " + trainer.name);
		}
		
		trainerManager.add(trainer2);
		trainerManager.delete(trainer1);
	}

}
