
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestFireBase {


    public static void main(String[] args) {
        //Project name
        String project="changua";

        //Secret
        String secret="xxxx";

        //New Firebase object
        Firebase firebase=new Firebase(project,secret);

        //Name of document to update
        String document="doubleint";

        //Data for document
        String str = "{     \"output\": 0.377,\"control\": -1.259  }";

        //Writes document to Firebase
        System.out.println("Firebase response: "+firebase.write(document,str));

        //Reads document from Firebase
        System.out.println(firebase.read("doubleint"));
    }
}
