package tmalcher.study.com.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfigFirebase {

    private  static FirebaseAuth authenticationFirebase;
    // retur instance firebase
    public static FirebaseAuth getFirebaseAuthentication(){
        if(authenticationFirebase == null) {
            authenticationFirebase = FirebaseAuth.getInstance();
        }

        return authenticationFirebase;
    }

}
