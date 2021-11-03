package clientsFlUlSort;

import java.util.ArrayList;
import java.util.Random;

public class DataClient {

    public ArrayList<Client> createClients(int size) {

        ClientGenerator individualGenerator = new IndividualGenerator();
        ClientGenerator organizationGenerator = new OrganizationGenerator();


        ArrayList<Client> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, random.nextBoolean() ? individualGenerator.generateClient() : organizationGenerator.generateClient());
        }

//        Client[] clients = new Client[countClients];
//        Random random = new Random();
//        for (int i = 0; i < countClients; i++) {
//            clients[i] = random.nextBoolean() ? individualGenerator.generateClient() : organizationGenerator.generateClient();
//        }
        return list;

    }
}




