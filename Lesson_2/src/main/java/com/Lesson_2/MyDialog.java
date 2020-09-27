package com.Lesson_2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {

    public Dialog onCreateDialog( Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity() );
        return builder
                .setTitle("Удаление")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Вы уверены что хотите удалить?")
                .create();
    }
}
