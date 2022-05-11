import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.HashMap;
import java.util.Map;

public class repoJournal extends journal{

    FirebaseFirestore firebaseFirestore;

    public void createJournal() {
            Map<String, Object> journal = new HashMap<>();
           // journal.put("", );
            //journal.put("", );
           // journal.put("", );
    }

    public void readJournal(String email) {
        CollectionReference users = firebaseFirestore.collection("journal");
        Query query = users.whereEqualTo("email",email);
    }

    public void updateJournal(String email) {
        CollectionReference users = firebaseFirestore.collection("journal");
        Query query = users.whereEqualTo("email",email);
    }

    public void deleteJournal(String email) {
        CollectionReference users = firebaseFirestore.collection("journal");
        Query query = users.whereEqualTo("email",email);
    }


}
