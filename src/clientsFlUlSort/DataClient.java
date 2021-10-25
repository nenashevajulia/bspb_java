package clientsFlUlSort;

import java.util.Random;

public class DataClient {

    public Client[] createClients(int countClients) {

        ClientGenerator individualGenerator = new IndividualGenerator();
        ClientGenerator organizationGenerator = new OrganizationGenerator();

        Client[] clients = new Client[countClients];
        Random random = new Random();
        for (int i = 0; i < countClients; i++) {
            clients[i] = random.nextBoolean() ? individualGenerator.generateClient() : organizationGenerator.generateClient();

        }
        return clients;

    }
}




