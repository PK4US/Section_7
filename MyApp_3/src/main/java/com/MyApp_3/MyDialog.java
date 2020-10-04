package com.MyApp_3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment{

    public Dialog onCreateDialog( Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity() );
        return builder
                .setTitle("Ошибка!")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Вы ввели число не от 0 до 10")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getContext (), "Должно быть введено только число, причём строго от 1 до 10", Toast.LENGTH_SHORT).show();
                     }
                })
                .create();
    }
}