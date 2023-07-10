package oopIntro;

public class TrainerManager {
	public void add(Trainer trainer) {
		System.out.println("Eğitmen eklendi : " + trainer.name);
	}
	
	public void delete(Trainer trainer) {
		System.out.println("Eğitmen silindi : " + trainer.name);
	}
}
