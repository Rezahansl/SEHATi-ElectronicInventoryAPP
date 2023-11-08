package com.rk.electronic.ui.supplier;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseManager {
    private static final String SUPPLIER_PATH = "electronic/supplier";
    private DatabaseReference databaseReference;

    public FirebaseManager() {
        // Inisialisasi Firebase Realtime Database
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        // Mendapatkan referensi ke "supplier" dalam database
        databaseReference = firebaseDatabase.getReference(SUPPLIER_PATH);
    }

    public DatabaseReference getDatabaseReference() {
        return databaseReference;
    }
}
