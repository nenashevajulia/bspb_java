package clientsFlUlSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ClientsFlUlSort {
    public static void main(String[] args) {

        DataClient dataClient = new DataClient();
        ArrayList<Client> clients = dataClient.createClients(100);

        int resultLength = 0;
        for (int i = 0; i < clients.size(); i++) {
            var client = clients.get(i);
            if (client instanceof Individual) {
                if (((Individual) client).getGender().equals("male")) {
                    resultLength++;
                }
            }
        }

        Individual[] individualClients = new Individual[resultLength];
        int j = 0;
        for (int i = 0; i < clients.size(); i++) {
            var client = clients.get(i);
            if (client instanceof Individual) {
                if (((Individual) client).getGender().equals("male")) {
                    individualClients[j] = (Individual) client;
                    j++;
                }
            }
        }

        Arrays.sort(individualClients, new Comparator<Individual>() {
            @Override
            public int compare(Individual o1, Individual o2) {
                return o1.getYear() - o2.getYear();
            }
        });

        System.out.println(Arrays.deepToString(individualClients));
    }

}

//        Client[] clients = dataClient.createClients(10);
//
//        int resultLength = 0;
//        for (int i = 0; i < clients.length; i++) {
//            var client = clients[i];
//            if (client instanceof Individual) {
//                if (((Individual) client).getGender().equals("male")) {
//                    resultLength++;
//                }
//            }
//        }
//
//        Individual[] individualClients = new Individual[resultLength];
//        int j = 0;
//        for (int i = 0; i < clients.length; i++) {
//            var client = clients[i];
//            if (client instanceof Individual) {
//                if (((Individual) client).getGender().equals("male")) {
//                    individualClients[j] = (Individual) client;
//                    j++;
//                }
//            }
//        }
//
//        Arrays.sort(individualClients, new Comparator<Individual>() {
//            @Override
//            public int compare(Individual o1, Individual o2) {
//                return o1.getYear() - o2.getYear();
//            }
//        });
//
//        System.out.println(Arrays.deepToString(individualClients));
//    }