import android.content.SharedPreferences;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.HashMap;
import java.util.Map;

public class repoUsers {

    FirebaseFirestore firebaseFirestore;

    public void readUser(String email) {
        CollectionReference users = firebaseFirestore.collection("users");
        Query query = users.whereEqualTo("email",email);
    }

    public void updateUser (String email) {
        CollectionReference users = firebaseFirestore.collection("users");
        Query query = users.whereEqualTo("email",email);
    }

    public void deleteUser (String email) {
        CollectionReference users = firebaseFirestore.collection("users");
        Query query = users.whereEqualTo("email",email);
    }
}
