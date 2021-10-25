package clientsFlUlSort;

import java.util.Random;

public class IndividualGenerator extends Client implements ClientGenerator {

    public long generateInnInd() {
        Random random = new Random();
        return (long) Math.floor(Math.random() * 9_000_000_000_00L) + 1_000_000_000_00L;
    }

    public String generateFioMale() {
        Random random = new Random();
        String[] indFioMale = {
                "Кулебяка Игорь Олегович", "Федоров Ибрагим Данилович", "Ильин Лев Владимирович", "Сорокин Борис Макарович", "Чернышев Артур Даниилович"
        };
        int i = random.nextInt(indFioMale.length);
        return (indFioMale[i]);
    }

    public String generateFioFemale() {
        Random random = new Random();
        String[] indFioFemale = {
                "Казакова Евгения Билаловна", "Константинова Констанция Константинова", "Челотарова Арина Александровна", "Зайцева Вера Кирилловна", "Черная Наталья Захаровна"
        };
        int i = random.nextInt(indFioFemale.length);
        return (indFioFemale[i]);
    }

    public int generateYear() {
        Random random = new Random();
        return random.nextInt((2007 - 1920) + 1) + 1920;
    }

    private String generateGender() {
        Random random = new Random();
        String[] gender = new String[]{"male", "female"};
        int i = random.nextInt(gender.length);
        return (gender[i]);
    }

    @Override
    public Client generateClient() {
        Individual individual = new Individual();
        individual.setId(generateId());
        individual.setInn(generateInnInd());
        individual.setGender(generateGender());
        individual.setYear(generateYear());
        String currentGender = individual.getGender();
        if (currentGender.equals("male")) {
            individual.setFio(generateFioMale());
        } else {
            individual.setFio(generateFioFemale());
        }
        return individual;
    }

}
