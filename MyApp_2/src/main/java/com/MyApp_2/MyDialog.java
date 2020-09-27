package com.MyApp_2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {

    public Dialog onCreateDialog( Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity() );
        return builder
                .setTitle("Ошибка")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Вы ввели число не от 0 до 10")
                .create();
    }
}
