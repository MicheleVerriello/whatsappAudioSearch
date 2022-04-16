package activities;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.whatsappaudiosearch.R;

import java.io.File;

import shared.FileManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void getAllWhatsAppAudios(View view) {
        System.out.println("Build.VERSION.SDK_INT: " + Build.VERSION.SDK_INT);
        String whatsAppAudiosDirectoryPath = Build.VERSION.SDK_INT < 30  ? "/WhatsApp/Media/WhatsApp Audio" : "/Android/media/com.whatsapp/WhatsApp/Media/WhatsApp Audio";

        File[] whatsAppAudioFiles = FileManager.getAllFilesByDirectoryPath(whatsAppAudiosDirectoryPath);
    }
}