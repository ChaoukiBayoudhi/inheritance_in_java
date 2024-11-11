import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
public class Store {
    //we want to fetch client using the id
    //Map : store information in key/value pairs
    //1:new Client(1, .....)
    //2:new Client(2, .....)
    //Map in java has many possible implementations
    //HashMap : use a hash table to manage client
    //TreeMap : use a tree
    //Create a Map:
    //Map<int, Client> clients = new HashMap<>();
    //int : type of the key
    //Client: type of the value
    //some predefined functions on Map:
    //add a client to the map:
    //clients.put(1, new Client(1,....));
    //Client c1=clients.get(1);
    //clients.remove(1); //remove the client using the value of the key
    //boolean rest=clients.containsKey(1);
    //boolean result=clients.containsValue(c1);
    //boolean res=clients.isEmpty();
    //int nb=clients.size();
    //...
    //loop through Map
    //for(Map.Entry<int,Client> entry:clients.entrySet())
    //System.out.println(entry.getKey())+":"+entry.getValue()}


    //attribute
   private  Map<Integer, Client> clients = new HashMap<>();

   public boolean addClient(Client client){
       //verify if the client id already exists on the keySet
       if(clients.containsKey(client.getId()))
           return false;
       clients.put(client.getId(),client);
       return true;
   }
   public void printClients(){
       System.out.println("List of clients:");
        for(Map.Entry<Integer,Client> entry:clients.entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());
   }


}