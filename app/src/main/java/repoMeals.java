import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.HashMap;
import java.util.Map;

public class repoMeals {

    FirebaseFirestore firebaseFirestore;

    public void createMeal(){
        Map<String, Object> meal = new HashMap<>();
        meal.put("", );
        meal.put("", );
        meal.put("", );
    }

    public void readMeal(String email) {
        CollectionReference users = firebaseFirestore.collection("meals");
        Query query = users.whereEqualTo("email",email);
    }

    public void updateMeal(String email) {
        CollectionReference users = firebaseFirestore.collection("meals");
        Query query = users.whereEqualTo("email",email);
    }

    public void deleteMeal(String email) {
        CollectionReference users = firebaseFirestore.collection("meals");
        Query query = users.whereEqualTo("email",email);
    }



}
