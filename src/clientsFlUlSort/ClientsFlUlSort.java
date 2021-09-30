package clientsFlUlSort;

import java.util.Arrays;
import java.util.Comparator;

public class ClientsFlUlSort {
    public static void main(String[] args) {
        int resultLength = 0;
        for (int i = 0; i < DataClients.clients.length; i++) {
            var client = DataClients.clients[i];
            if (client instanceof Individual) {
                if (((Individual) client).getGender().equals("male")) {
                    resultLength++;
                }
            }
        }

        Individual[] individualClients = new Individual[resultLength];
        int j = 0;
        for (int i = 0; i < DataClients.clients.length; i++) {
            var client = DataClients.clients[i];
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
