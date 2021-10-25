package clientsFlUlSort;

import java.util.Random;

public class OrganizationGenerator extends Client implements ClientGenerator {

    public long generateInnOrg() {
        Random random = new Random();
        return (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    }

    public String generateName() {
        Random random = new Random();
        String[] name = {"Ассоцияция Деревьев", "Лосиная ферма Аннушка", "Рога, копыта и хвост", "Провода Кулибина", "Травы Алтая", "Какаду И Коко", "Красный маяк", "Зелёный километр", "Белая береза в клеточку", "Наследие Java"

        };
        int i = random.nextInt(name.length);
        return (name[i]);
    }

    public long generateOgrn() {
        Random random = new Random();
        return (long) Math.floor(Math.random() * 9_000_000_000_000L) + 1_000_000_000_000L;
    }

    @Override
    public Client generateClient() {
        Organization organization = new Organization();
        organization.setId(generateId());
        organization.setInn(generateInnOrg());
        organization.setName(generateName());
        organization.setOgrn(generateOgrn());
        return organization;

    }
}
