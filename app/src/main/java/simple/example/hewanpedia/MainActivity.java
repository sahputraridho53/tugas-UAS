package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAnggrek,btnKaktus, btnMawar;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnAnggrek = findViewById(R.id.btn_buka_ras_kucing);
        btnKaktus = findViewById(R.id.btn_buka_ras_anjing);
        btnMawar = findViewById(R.id.btn_buka_ras_mawar);
        btnAnggrek.setOnClickListener(view -> bukaGaleri("Anggrek"));
        btnKaktus.setOnClickListener(view -> bukaGaleri("Kaktus"));
        btnMawar.setOnClickListener(view -> bukaGaleri("Mawar"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}