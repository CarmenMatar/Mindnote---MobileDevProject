import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.HashMap;
import java.util.Map;

public class repoExercises extends exercises{


    FirebaseFirestore firebaseFirestore;
    String userId;
    SharedPreferences sharedPreferences;

   // public String getUserId () {
       // String uid;
        //sharedPreferences = PreferenceManager.getDefaultSharedPreferences();
     //   return uid;
   // }


    public void createExercise (String id, String name, String Category) {

        Map<String, Object> exercise = new HashMap<>();
        exercise.put("id", id);
        exercise.put("name", name);
        exercise.put("Category", Category);
        exercise.put("userId", userId);
    }

    public void readExercise(String email) {
        CollectionReference users = firebaseFirestore.collection("exercises");
        Query query = users.whereEqualTo("email",email);
    }

    public void updateExercise(String email) {
        CollectionReference users = firebaseFirestore.collection("exercises");
        Query query = users.whereEqualTo("email",email);
    }

    public void deleteExercise(String email) {
        CollectionReference users = firebaseFirestore.collection("exercises");
        Query query = users.whereEqualTo("email",email);
    }

}
